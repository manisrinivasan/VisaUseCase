/*
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.generic.app.visausecase.dao;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.TimeUnit;

import com.datastax.driver.core.BatchStatement;
import com.datastax.driver.core.BoundStatement;
import com.datastax.driver.core.Cluster;
import com.datastax.driver.core.ConsistencyLevel;
import com.datastax.driver.core.ExecutionInfo;
import com.datastax.driver.core.PreparedStatement;
import com.datastax.driver.core.QueryTrace;
import com.datastax.driver.core.ResultSet;
import com.datastax.driver.core.ResultSetFuture;
import com.datastax.driver.core.Row;
import com.datastax.driver.core.Session;
import com.datastax.driver.core.SimpleStatement;
import com.datastax.driver.core.Statement;
import com.datastax.driver.core.exceptions.NoHostAvailableException;
import com.datastax.driver.core.exceptions.UnavailableException;
import com.datastax.driver.core.policies.DowngradingConsistencyRetryPolicy;
import com.datastax.driver.core.policies.LoggingRetryPolicy;
import com.generic.app.visausecase.dto.VisaOffers;
import com.generic.app.visausecase.utils.CassandraConnectionUtil;

public class VisaDaoModified {

	private static Session session = null;

	public VisaDaoModified(Session session) {
		this.session = session;
	}

	
	public void VisaInsertData(List<VisaOffers> list, int batchsize) {
		List<ResultSetFuture> results = new ArrayList<ResultSetFuture>();
/*
 * 
 * CREATE TABLE token_reqest_ref (tokn_reqst_id text, token_ref_id text, token_num text, pan text,
 *  auth_date text, auth_time text, acqr_bin text, crd_acptr_id text, network_tran_id text, resp_cd text, 
 *  curr_cd text, mcc int, mrch_nm text, msg_catg int, network_id int, pan_ref_id text, posentry_mode text,
 *   acn int, tran_amt float, tran_id text, uniq_seq_id text, mrch_nm_drvd text, acqr_bin_drvd int, 
 * repl_amt float, status_check_ind int, reserved text PRIMARY KEY (( tokn_reqst_id,token_ref_id,acn)) );
 */
		
/*
 * private String tokn_reqst_id;
	private String token_ref_id;
	private String status_check_ind;
	private Double tran_amt;
 */
		PreparedStatement ps3 = session
				.prepare("INSERT INTO Visa.token_reqest_ref "
						+ "(tokn_reqst_id, token_ref_id,status_check_ind,reserved,acn,tran_amt,token_num,pan,auth_date,auth_time,acqr_bin,"
						+ "crd_acptr_id,network_tran_id,resp_cd,curr_cd,mcc,mrch_nm,msg_catg,network_id,pan_ref_id,posentry_mode,tran_id,"
						+ "uniq_seq_id,mrch_nm_drvd,acqr_bin_drvd,repl_amt) "
						+ "VALUES (?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?);");
		
		//token_num
		PreparedStatement ps4 = session
				.prepare("INSERT INTO Visa.token_num "
						+ "(tokn_reqst_id, token_ref_id,status_check_ind,reserved,acn,tran_amt,token_num,pan,auth_date,auth_time,acqr_bin,"
						+ "crd_acptr_id,network_tran_id,resp_cd,curr_cd,mcc,mrch_nm,msg_catg,network_id,pan_ref_id,posentry_mode,tran_id,"
						+ "uniq_seq_id,mrch_nm_drvd,acqr_bin_drvd,repl_amt) "
						+ "VALUES (?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?);");
		ps3.setConsistencyLevel(ConsistencyLevel.ONE);
		ps4.setConsistencyLevel(ConsistencyLevel.ONE);
		//StringBuilder sb = new StringBuilder("BEGIN BATCH \n");
		
		long count = list.size();
		int i = 0;
		for (VisaOffers Visa : list) {
			i++;
			
			
					if (i % 1000 == 0) {
				System.out.println("Number of rows inserted so far..." + i);
			}
			

					//System.out.println("here we go");
					results.add(session.executeAsync(
							ps3.bind(Visa.getTokn_reqst_id(), Visa.getToken_ref_id(), Visa.getStatus_check_ind(),
									Visa.getReserved(),Visa.getAcn(),Visa.getTran_amt(),Visa.getToken_num()
									,Visa.getPan(),Visa.getAuth_date(),Visa.getAuth_time()
									,Visa.getAcqr_bin(),Visa.getCrd_acptr_id(),
									Visa.getNetwork_tran_id(),Visa.getResp_cd(),Visa.getCurr_cd(),Visa.getMcc()
									,Visa.getMrch_nm(),Visa.getMsg_catg(),Visa.getNetwork_id()
									,Visa.getPan_ref_id(),Visa.getPosentry_mode()
									,Visa.getTran_id(),Visa.getUniq_seq_id()
									,Visa.getMrch_nm_drvd(),Visa.getAcqr_bin_drvd()
									,Visa.getRepl_amt())));	
					results.add(session.executeAsync(
							ps4.bind(Visa.getTokn_reqst_id(), Visa.getToken_ref_id(), Visa.getStatus_check_ind(),
									Visa.getReserved(),Visa.getAcn(),Visa.getTran_amt(),Visa.getToken_num()
									,Visa.getPan(),Visa.getAuth_date(),Visa.getAuth_time()
									,Visa.getAcqr_bin(),Visa.getCrd_acptr_id(),
									Visa.getNetwork_tran_id(),Visa.getResp_cd(),Visa.getCurr_cd(),Visa.getMcc()
									,Visa.getMrch_nm(),Visa.getMsg_catg(),Visa.getNetwork_id()
									,Visa.getPan_ref_id(),Visa.getPosentry_mode()
									,Visa.getTran_id(),Visa.getUniq_seq_id()
									,Visa.getMrch_nm_drvd(),Visa.getAcqr_bin_drvd()
									,Visa.getRepl_amt())));	
					
					
			for (ResultSetFuture future : results) {
				try{
				
				ResultSet uninterruptibly = future.getUninterruptibly() ;
		
				}
				catch( UnavailableException e)
				{

					System.out.println("Exception Thrown here,"+e.getMessage());
				}
				
			}
			
			results.clear();
	//		sb = null;

		}
		return;
		


	
	}


	public static int retrieveVisaData(int count) {
		System.out.println("count"+ count);
		int i = 0;
		ResultSet rs = null;
		long starttime;
		//"40112345670", "DNITHE381430217790000349"
		PreparedStatement ps = session
				.prepare("select * from token_reqest_ref where tokn_reqst_id='40112345670' and token_ref_id='DNITHE381430217790000349' and acn=?");
		for (int j = 1; j <= count; j++) {
			 starttime = System.currentTimeMillis();
			rs = session.execute(ps.bind(j));
			for (Row row : rs) {
				i++;
				 System.out.println("rs.tokn_reqst_id"+row.getString("tokn_reqst_id") );
				 System.out.println("rs.token_ref_id"+row.getString("token_ref_id") );
				 System.out.println("rs.acn"+row.getInt("acn") );
System.out.println("***********");
				// row.getLong("alrt_id")+ row.getString("acct_fundg_src_cd") +
				// row.getString("acct_fundg_src_subtyp_cd"));
			}
			long endtime = System.currentTimeMillis();
			long diff = endtime - starttime;
			String str = "ACN"+ i +":"+ new Date().toString() + " " + " To process " + 1
					+ "records: " + ":in " + (diff * 1000) + "" + " us" + ":in "
					+ (diff) + "" + " ms" + ":in " + (diff / 1000) + ""
					+ " seconds";
			System.out.println(str);

		}
		System.out.println("i is "+ i);
		return i;

	}

}
