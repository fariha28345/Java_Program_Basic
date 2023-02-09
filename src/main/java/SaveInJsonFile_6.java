import org.json.simple.JSONObject;

import java.util.Scanner;
import java.io.*;
public class SaveInJsonFile_6 {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);

        JSONObject userObj = new JSONObject();
        System.out.print("Enter Full Name: ");
        userObj.put("Full Name", sc.nextLine());
        System.out.print("Enter Email: ");
        userObj.put("Email", sc.nextLine());
        System.out.print("Enter Password: ");
        userObj.put("Password", sc.nextLine());
        System.out.print("Enter Address: ");
        userObj.put("Address", sc.nextLine());
        System.out.print("Enter Mobile Number: ");
        userObj.put("Mobile No", sc.nextBigInteger());

        FileWriter file = new FileWriter("./src/main/resources/User.json");
        file.write(userObj.toJSONString());
        file.flush();
        System.out.println(userObj);
    }
}
