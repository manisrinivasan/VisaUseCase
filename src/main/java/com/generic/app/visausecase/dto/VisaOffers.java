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

package com.generic.app.visausecase.dto;

public class VisaOffers {


	/** This is visa test case 3
	 * */
	
	private String tokn_reqst_id;
	private String token_ref_id;
	private Integer status_check_ind;
	private Float tran_amt;
	private String reserved;
	private Integer acn;
	private String token_num;
	
	
	private String pan;
	public String getPan() {
		return pan;
	}

	public void setPan(String pan) {
		this.pan = pan;
	}

	public String getAuth_date() {
		return auth_date;
	}

	public void setAuth_date(String auth_date) {
		this.auth_date = auth_date;
	}

	public String getAuth_time() {
		return auth_time;
	}

	public void setAuth_time(String auth_time) {
		this.auth_time = auth_time;
	}

	public String getAcqr_bin() {
		return acqr_bin;
	}

	public void setAcqr_bin(String acqr_bin) {
		this.acqr_bin = acqr_bin;
	}

	public String getCrd_acptr_id() {
		return crd_acptr_id;
	}

	public void setCrd_acptr_id(String crd_acptr_id) {
		this.crd_acptr_id = crd_acptr_id;
	}

	public String getNetwork_tran_id() {
		return network_tran_id;
	}

	public void setNetwork_tran_id(String network_tran_id) {
		this.network_tran_id = network_tran_id;
	}

	public String getResp_cd() {
		return resp_cd;
	}

	public void setResp_cd(String resp_cd) {
		this.resp_cd = resp_cd;
	}

	public String getCurr_cd() {
		return curr_cd;
	}

	public void setCurr_cd(String curr_cd) {
		this.curr_cd = curr_cd;
	}

	public Integer getMcc() {
		return mcc;
	}

	public void setMcc(Integer mcc) {
		this.mcc = mcc;
	}

	public String getMrch_nm() {
		return mrch_nm;
	}

	public void setMrch_nm(String mrch_nm) {
		this.mrch_nm = mrch_nm;
	}

	public Integer getMsg_catg() {
		return msg_catg;
	}

	public void setMsg_catg(Integer msg_catg) {
		this.msg_catg = msg_catg;
	}

	public Integer getNetwork_id() {
		return network_id;
	}

	public void setNetwork_id(Integer network_id) {
		this.network_id = network_id;
	}

	public String getPan_ref_id() {
		return pan_ref_id;
	}

	public void setPan_ref_id(String pan_ref_id) {
		this.pan_ref_id = pan_ref_id;
	}

	public String getPosentry_mode() {
		return posentry_mode;
	}

	public void setPosentry_mode(String posentry_mode) {
		this.posentry_mode = posentry_mode;
	}

	public String getTran_id() {
		return tran_id;
	}

	public void setTran_id(String tran_id) {
		this.tran_id = tran_id;
	}

	public String getUniq_seq_id() {
		return uniq_seq_id;
	}

	public void setUniq_seq_id(String uniq_seq_id) {
		this.uniq_seq_id = uniq_seq_id;
	}

	public String getMrch_nm_drvd() {
		return mrch_nm_drvd;
	}

	public void setMrch_nm_drvd(String mrch_nm_drvd) {
		this.mrch_nm_drvd = mrch_nm_drvd;
	}

	public Integer getAcqr_bin_drvd() {
		return acqr_bin_drvd;
	}

	public void setAcqr_bin_drvd(Integer acqr_bin_drvd) {
		this.acqr_bin_drvd = acqr_bin_drvd;
	}

	public Float getRepl_amt() {
		return repl_amt;
	}

	public void setRepl_amt(Float repl_amt) {
		this.repl_amt = repl_amt;
	}

	public void setTran_amt(Float tran_amt) {
		this.tran_amt = tran_amt;
	}

	private String auth_date;
	private String auth_time;
	private String acqr_bin;
	private String crd_acptr_id;
	private String network_tran_id;
	private String resp_cd;
	private String curr_cd;
	private Integer mcc;
	private String mrch_nm;
	private Integer msg_catg;
	private Integer network_id;
	private String pan_ref_id;
	private String posentry_mode;
	private String tran_id;
	private String uniq_seq_id;
	private String mrch_nm_drvd;
	private Integer acqr_bin_drvd;
	private Float repl_amt;
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	public VisaOffers( String tokn_reqst_id, String token_ref_id,
	 Integer status_check_ind, Float tran_amt,String reserved,int acn,String token_num,String pan,String auth_date,String auth_time,String acqr_bin
	 ,String crd_acptr_id,String network_tran_id,String resp_cd,String curr_cd,Integer mcc,String mrch_nm,Integer msg_catg,Integer network_id,
	 String pan_ref_id,String posentry_mode,String tran_id,String uniq_seq_id,String mrch_nm_drvd,Integer acqr_bin_drvd,
	 Float repl_amt)
	 {
		this.tokn_reqst_id=tokn_reqst_id;
		this.token_ref_id=token_ref_id;
		this.status_check_ind=status_check_ind;
		this.tran_amt=tran_amt;
		this.reserved=reserved;
		this.acn=acn;
		this.token_num=token_num;
		this.pan=pan;
		this.auth_date=auth_date;
		this.auth_time=auth_time;
		this.acqr_bin=acqr_bin;
		this.crd_acptr_id=crd_acptr_id;
		this.network_tran_id=network_tran_id;
		this.resp_cd=resp_cd;
		this.curr_cd=curr_cd;
		this.mcc=mcc;
		this.mrch_nm=mrch_nm;
		this.msg_catg=msg_catg;
		this.network_id=network_id;
		this.pan_ref_id=pan_ref_id;
		this.posentry_mode=posentry_mode;
		this.tran_id=tran_id;
		this.uniq_seq_id=uniq_seq_id;
		this.mrch_nm_drvd=mrch_nm_drvd;
		this.acqr_bin_drvd=acqr_bin_drvd;
		this.repl_amt=repl_amt;
		
	 }
	
		public String getTokn_reqst_id() {
		return tokn_reqst_id;
	}

	public void setTokn_reqst_id(String tokn_reqst_id) {
		this.tokn_reqst_id = tokn_reqst_id;
	}

	public String getToken_ref_id() {
		return token_ref_id;
	}

	public void setToken_ref_id(String token_ref_id) {
		this.token_ref_id = token_ref_id;
	}

	public Integer getStatus_check_ind() {
		return status_check_ind;
	}

	public void setStatus_check_ind(Integer status_check_ind) {
		this.status_check_ind = status_check_ind;
	}

	public Float getTran_amt() {
		return tran_amt;
	}

	public void setTran_amt(float tran_amt) {
		this.tran_amt =  tran_amt;
	}

	public String getReserved() {
		return reserved;
	}

	public void setReserved(String reserved) {
		this.reserved = reserved;
	}

	public Integer getAcn() {
		return acn;
	}

	public void setAcn(Integer acn) {
		this.acn = acn;
	}

	public String getToken_num() {
		return token_num;
	}

	public void setToken_num(String token_num) {
		this.token_num = token_num;
	}

}
