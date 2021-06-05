/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;
import java.io.Serializable;
/**
 *
 * @author Seok17
 */
public class UserAccount implements Serializable{
    private String id;
    private String pw="";
    private String name;
    private int type;  //0 = 로그인, 1 = 회원가입, 2 = 계정 찾기
    
    public String getId(){
        return id;
    }
    public String getPw(){
        return pw;
    }
    public String getName(){
        return name;
    }
    public void setName(String name){
        this.name = name;
    }
    public void setId(String id){
        this.id = id;
    }
    public void setPw(String pw){
        this.pw = pw;
    }
    public int getType() {
	return type;
    }
    public void setType(int type) {
	this.type = type;
    }
}
