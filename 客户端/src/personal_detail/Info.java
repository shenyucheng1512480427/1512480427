package personal_detail;
import java.io.*;
public class Info{
	public void infoMain() throws IOException{
		String[] account = new String [100];
		String[] username = new String [100];
		String[] password = new String [100];
		int num=2;//第几个账号,暂时为2
		FileReader fis = new FileReader(".\\1.txt");
		BufferedReader buf = new BufferedReader(fis);
		for(int i = 0;i < num;i++){
			account[i] = buf.readLine();
			username[i] = buf.readLine();
			password[i] = buf.readLine();
		}
		person [] p1= new person [num];
		for(int i = 0;i < num;i++){
			p1[i] = new person(account[i],username[i],password[i]);
		}
		
	}
}
class person{
	//头像
	String account;
	String address;
	String username;
	String password;
	String sex;
	int age;
	int balance/*余额*/;
	boolean vip;
	int score;
	//构造方法
	public person(String account,String username,String password){
		this.account =account;
		this.username = username;
		this.password = password;
	}
	//输出方法
	String showaccount(){return account;}
	String showaddress(){return address;}
	String showusername(){return username;}
	String showpassword(){return password;}
	String showsex(){return sex;}
	int showage(){return age;}
	int showbalance(){return balance;}
	boolean showvip(){return vip;}
	int showscore(){return score;}
	//修改方法
	void setaccount(String account){this.account =account; }
	void setaddress(String address){this.address = address; }
	void setusername(String username){this.username = username; }
	void setpassword(String password){this.password = password; }
	void setsex(String sex){this.sex = sex; }
	void setage(int age){this.age = age; }
	void setbalance(int balance){this.balance = balance; }
	void setvip(boolean vip){this.vip = vip; }
	void setscore(int score){this.score =score; }

}