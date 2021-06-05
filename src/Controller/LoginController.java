/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;
import View.LoginViewGUI;
import Model.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.*;
import java.net.*;
import javax.swing.JOptionPane;
/**
 *
 * @author Seok17
 */
public class LoginController extends Thread{
    
    LoginViewGUI loginView;
    UserAccount user;
    
    ServerInfo serverInfo;
    Socket socket;
    ObjectOutputStream oos;
    ObjectInputStream ois;
    
    public LoginController() {
        serverInfo = ServerInfo.getInstance();
        loginView = new LoginViewGUI();
        loginView.setVisible(true);
        
        loginView.LoginBtn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                 if(loginView.LoginBtn.equals(e.getSource())){
                     LoginBtnClick(e);
      }
            }
        });
  }
    
  
    public void actionPerformed(java.awt.event.ActionEvent evt) {
      if(loginView.LoginBtn.equals(evt.getSource())){
          LoginBtnClick(evt);
      }
      else if(loginView.signUpBtn.equals(evt.getSource())){
          signUpBtnClick();
      }
      else if(loginView.findAccBtn.equals(evt.getSource())){
          findAccBtnClick();
      }
      
        
    }
    public void LoginBtnClick(java.awt.event.ActionEvent evt) {                               
        if((loginView.idField.getText()).equals("aa") || new String(loginView.PasswordField.getPassword()).equals("aa")){
            JOptionPane.showMessageDialog(null, "로그인실패 아이디와 패스워드 확인하세요!");
        }else{
            
        }
    }  
    public void signUpBtnClick(){
        
    }
    
    public void  findAccBtnClick(){
    
    }
    

    public void run(){
        try{
            socket = new Socket(serverInfo.serverIp, serverInfo.loginPort);
            oos = new ObjectOutputStream(socket.getOutputStream());
            ois = new ObjectInputStream(socket.getInputStream());
            
        }catch(Exception e){
            System.out.println("err");
        }
    }
    
}
