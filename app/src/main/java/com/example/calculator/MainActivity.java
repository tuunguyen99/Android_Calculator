

package com.example.calculator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import static java.lang.Math.cos;
import static java.lang.Math.log;
import static java.lang.Math.pow;
import static java.lang.Math.sin;
import static java.lang.Math.sqrt;
import static java.lang.Math.tan;
import java.util.Arrays;
import java.util.Stack;


public class MainActivity extends AppCompatActivity {
    TextView hangDoi,text1;
    Button percent,ce,c,bs,oneperx,pow2,sQRT,divine,num1, num2, num3, num4, num5, num6,num7,num8,
           num0,dot,mutil,aDD,sUB, eQUAL, oR,num9;
    String hang_Chinh="0",hang_Phu="",tg="0";
    Double toanHang[]=null;
    int toanTu[] = new int[100];
    int i=0,j=0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        hangDoi = findViewById(R.id.hang_doi);
        text1  = findViewById(R.id.text1);
        percent  = findViewById(R.id.percent);
        ce  = findViewById(R.id.CE);
        c  = findViewById(R.id.C);
        bs = findViewById(R.id.BS);
        oneperx = findViewById(R.id.mot_chia_x);
        pow2 = findViewById(R.id.pow2);
        sQRT = findViewById(R.id.sqrt);
        divine = findViewById(R.id.divide);
        num1 = findViewById(R.id.num1);
        num2 = findViewById(R.id.num2);
        num3 = findViewById(R.id.num3);
        num4 = findViewById(R.id.num4);
        num5 = findViewById(R.id.num5);
        num6 = findViewById(R.id.num6);
        num7 = findViewById(R.id.num7);
        num8 = findViewById(R.id.num8);
        num9 = findViewById(R.id.num9);
        num0 = findViewById(R.id.num0);
        dot = findViewById(R.id.dot);
        mutil = findViewById(R.id.mutil);
        aDD = findViewById(R.id.add);
        sUB = findViewById(R.id.sub);
        eQUAL = findViewById(R.id.equal);
        oR = findViewById(R.id.addorsub);
        num1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (hang_Chinh=="0"){
                    hang_Chinh = "1";
                }else{
                    hang_Chinh += "1";
                }
                text1.setText(hang_Chinh);
            }
        });
        num2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (hang_Chinh=="0"){
                    hang_Chinh = "2";
                }else{
                    hang_Chinh += "2";
                }
                text1.setText(hang_Chinh);
            }
        }


                );
        num3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (hang_Chinh=="0"){
                    hang_Chinh = "3";
                }else{
                    hang_Chinh += "3";

                }
                text1.setText(hang_Chinh);
            }
        }


        );
        num4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (hang_Chinh=="0"){
                    hang_Chinh = "4";
                }else{
                    hang_Chinh += "4";
                }
                text1.setText(hang_Chinh);
            }
        }


        );
        num5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (hang_Chinh=="0"){
                    hang_Chinh = "5";
                }else{
                    hang_Chinh += "5";
                }
                text1.setText(hang_Chinh);
            }
        }


        );
        num6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (hang_Chinh=="0"){
                    hang_Chinh = "6";
                }else{
                    hang_Chinh += "6";
                }
                text1.setText(hang_Chinh);
            }
        }


        );
        num7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (hang_Chinh=="0"){
                    hang_Chinh = "7";
                }else{
                    hang_Chinh += "7";
                }
                text1.setText(hang_Chinh);
            }
        }


        );
        num8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (hang_Chinh=="0"){
                    hang_Chinh = "8";
                }else {
                    hang_Chinh += "8";
                }
                text1.setText(hang_Chinh);
            }
        }


        );
        num9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (hang_Chinh=="0"){
                    hang_Chinh = "9";
                }else{
                    hang_Chinh += "9";
                }
                text1.setText(hang_Chinh);
            }
        });
        num0.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (hang_Chinh=="0"){
                    hang_Chinh = "0";
                }else{
                    hang_Chinh += "0";
                }
                text1.setText(hang_Chinh);
            }
        });
        aDD.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (hang_Chinh=="0"){
                    hang_Chinh="0";
                }else{
                        hang_Chinh += "+";
                }
                text1.setText(hang_Chinh);
            }
        });
        sUB.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (hang_Chinh=="0"){
                    hang_Chinh = "0";
                }else {
                        hang_Chinh += "-";
                }
                text1.setText(hang_Chinh);
            }
        });
        mutil.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (hang_Chinh=="0"){
                    hang_Chinh = "0";
                }else {
                        hang_Chinh += "*";
                }
                text1.setText(hang_Chinh);
            }
        });
        divine.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (hang_Chinh=="0"){
                    hang_Chinh = "0";
                }else {
                        hang_Chinh += "/";
                }
                text1.setText(hang_Chinh);
            }
        });


        sQRT.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (hang_Chinh=="0"){
                    hang_Chinh = "0";
                }else{
                    hang_Chinh = "√("+hang_Chinh+")";
                }
                text1.setText(hang_Chinh);
            }
        });
        c.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                hang_Chinh = "0";
                hang_Phu = "";
                text1.setText(hang_Chinh);
                hangDoi.setText(hang_Phu);
            }
        });
        bs.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (hang_Chinh=="0"){
                    hang_Chinh = "0";
                }else{
                    int l=hang_Chinh.length();
                    if (l==1){
                        hang_Chinh="0";
                    }else{
                    hang_Chinh=hang_Chinh.substring(0,l-1);
                    }

                }
                text1.setText(hang_Chinh);
            }
        });
        pow2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (hang_Chinh=="0"){
                    hang_Chinh = "0";
                }else{
                    hang_Chinh = "("+hang_Chinh+")^2";
                }
                text1.setText(hang_Chinh);
            }
        });
        oneperx.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (hang_Chinh=="0"){
                    hang_Chinh = "0";
                }else{
                    hang_Chinh = "1/("+hang_Chinh+")";
                }
                text1.setText(hang_Chinh);
            }
        });

        dot.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                    hang_Chinh += ".";
                    tg += ".";
                text1.setText(hang_Chinh);
            }
        });
        percent.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (hang_Chinh=="0"){
                    hang_Chinh = "0";
                }else{
                    hang_Chinh = "("+hang_Chinh+")%";
                }
                text1.setText(hang_Chinh);
            }
        });

        oR.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (hang_Chinh=="0"){
                    hang_Chinh = "0";
                }else{
                    if ((int)hang_Chinh.charAt(0) == 45){
                        hang_Chinh=hang_Chinh.substring(1);
                    }else{
                        hang_Chinh= "-("+hang_Chinh+")";
                    }
                }
                text1.setText(hang_Chinh);
            }
        });
        ce.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (hang_Chinh == "0") {
                    hang_Chinh = "0";
                } else {
                    int l = hang_Chinh.length();
                    for(int i=l-1;i>-1;i--){
                        if(isOperator(hang_Chinh.charAt(i))){
                            break;
                        }else {
                            if (hang_Chinh.length() == 1) {
                                hang_Chinh = "0";
                                break;
                            } else {
                                hang_Chinh = hang_Chinh.substring(0, hang_Chinh.length() - 1);
                            }
                        }
                    }
                }
                text1.setText(hang_Chinh);
            }
        });

        eQUAL.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                hang_Phu=hang_Chinh+"=";
                try {
                    if(hang_Chinh.substring(0,1).equals("√")){
                        Double sqrtTG= compute(hang_Chinh.substring(1));
                        hang_Chinh = ""+sqrt(sqrtTG);
                    }else{
                        if(hang_Chinh.substring(hang_Chinh.length()-1).equals("%")){
                            Double percentTG = compute(hang_Chinh.substring(0,hang_Chinh.length()-1))/100;
                            hang_Chinh=""+percentTG;
                        }else {
                            if(hang_Chinh.substring(0,1).equals("-")){
                                Double subTG= compute(hang_Chinh.substring(1));
                                hang_Chinh = "-"+subTG;}
                            else {
                                Double a = compute(hang_Chinh);
                                hang_Chinh = "" + a;
                            }
                        }
                    }
                }catch (Exception e){
                    hang_Chinh="input error";
                }

                text1.setText(hang_Chinh);
                hangDoi.setText(hang_Phu);
            }
        });

    }
    public static String standardize(String math) {
        String newMath = "";
        int i;
        for (i = 0; i < math.length(); i++) {
            char c = math.charAt(i);
            if (!isOperator(c)) {
                newMath = newMath + c;
            } else {
                if (isOneOperator(c)) {
                    newMath = newMath + " " + c;
                    i += 2;
                } else {
                    newMath = newMath + " " + c + " ";
                }

            }
        }
        return newMath;
    }

    public static boolean isOperator(char c) {
        char op[] = {'+', '-', '*', '/', '^', '(', ')', 's', 'c', 't', 'l'};
        Arrays.sort(op);
        if (Arrays.binarySearch(op, c) > -1)
        {
            return true;
        } else {
            return false;
        }
    }

    public static boolean isOneOperator(char c) {
        char op[] = {'s', 'c', 't', 'l'};
        Arrays.sort(op);
        if (Arrays.binarySearch(op, c) > -1) {
            return true;
        } else {
            return false;
        }
    }

    public static int priority(char c) {
        int priority = 0;
        if (c == '+' || c == '-') {
            priority = 4;
        }
        if (c == '*' || c == '/') {
            priority = 5;
        }
        if (c == '^' || c == 's' || c == 'c' || c == 't' || c == 'l') {
            priority = 6;
        }
        return priority;
    }

    public static String[] splitToken(String math) {
        String str = math.trim();                               //xoa dau cach o dau va cuoi dong
        str = str.replaceAll("\\s+", " ");                      //xoa ki tu " " thua
        String token[] = str.split(" ");

        return token;
    }

    public static String toPostfix(String math) {
        String postfix = "";
        String[] mathElement = splitToken(standardize(math));
        Stack<String> S = new Stack<String>();

        for (int i = 0; i < mathElement.length; i++) {
            char c = mathElement[i].charAt(0);

            if (!isOperator(c)) {
                postfix = postfix + mathElement[i] + " ";

            } else {
                if (c == '(') {
                    S.push(mathElement[i]);
                } else {
                    if (c == ')') {
                        char temp = ' ';
                        do {
                            temp = S.peek().charAt(0);
                            if (temp != '(') {
                                postfix = postfix + S.peek() + " ";

                            }
                            S.pop();

                        } while (temp != '(');

                    } else {
                        while (!S.isEmpty() && (priority(S.peek().charAt(0)) >= priority(c))) {
                            postfix = postfix + S.pop() + " ";

                        }
                        S.push(mathElement[i]);
                    }
                }

            }
        }
        while (!S.isEmpty()) {
            postfix = postfix + S.pop() + " ";
        }
        postfix = postfix.trim();
        postfix = postfix.replaceAll("\\s+", " ");

        return postfix;
    }

    public static double compute(String math) {
        String postfix = toPostfix(math);
        String[] mathElement = splitToken(postfix);
        for (int i = 0; i < mathElement.length; i++) {
        }
        Stack<Double> S = new Stack<Double>();
        double temp = 0f;
        for (int i = 0; i < mathElement.length; i++) {
            char c = mathElement[i].charAt(0);
            if (!isOperator(c)) {
                double value = Double.parseDouble(mathElement[i]);
                S.push(value);
            } else {
                if (!isOneOperator(c)) {
                    double num1 = (S.pop());
                    double num2 = (S.peek());
                    switch (c) {
                        case '+':
                            temp = num2 + num1;
                            break;
                        case '-':
                            temp = num2 - num1;
                            break;
                        case '*':
                            temp = num2 * num1;
                            break;
                        case '/':
                            temp = num2 / num1;
                            break;
                        case '^':
                            temp = pow(num2, num1);
                            break;
                        default:
                            break;

                    }
                    S.pop();
                    S.push(temp);

                } else {
                    switch (c) {
                        case 's':
                            temp = sin(S.peek());
                            break;
                        case 'c':
                            temp = cos(S.peek());
                            break;
                        case 't':
                            temp=  tan(S.peek());
                            break;
                        case 'l':
                            temp = log(S.peek());
                            break;

                        default:
                            break;

                    }

                    S.pop();
                    S.push(temp);
                }

            }
        }

        double result = S.pop();
        return result;
    }

}
