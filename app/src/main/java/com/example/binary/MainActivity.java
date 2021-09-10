package com.example.binary;
import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    private EditText editText;
    private TextView textView;
    Button Convert_btn;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
      //  Toast.makeText(this, "Please Write CAPS", Toast.LENGTH_LONG).show();
        textView = findViewById(R.id.showBinary);
        Convert_btn = findViewById(R.id.Convert_btn);
        Binary Binary = new Binary();


        //Set button alpha to zero
        Convert_btn.setAlpha(0f);

        //Animate the alpha value to 1f and set duration as 1.5 secs.
        Convert_btn.animate().alpha(1f).setDuration(1500);

        Convert_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                editText = findViewById(R.id.GetBinary);
                String A="A,a";
                if (A.contains(editText.getText().toString())) {
                    //Binary A
                    Binary.setA(1000001);
                    textView.setText("--> " + Binary.getA());
                }
                String B="B,b";
                if (B.contains(editText.getText().toString())) {
                    //Binary B
                    Binary.setB(1000010);
                    textView.setText("--> " + Binary.getB());
                }
                String C="C,c";
                if (C.contains(editText.getText().toString())) {
                    //Binary C
                    Binary.setC(1000011);
                    textView.setText("--> " + Binary.getC());
                }
                String D="D,d";
                if (D.contains(editText.getText().toString())) {
                    //Binary D
                    Binary.setD(1000100);
                    textView.setText("--> " + Binary.getD());
                }
                String E="E,e";
                if (E.contains(editText.getText().toString())) {
                    //Binary E
                    Binary.setE(1000101);
                    textView.setText("--> " + Binary.getE());
                }
                String F="F,f";
                if (F.contains(editText.getText().toString())) {
                    //Binary F
                    Binary.setF(1000110);
                    textView.setText("--> " + Binary.getF());
                }
                String G="G,g";
                if (G.contains(editText.getText().toString())) {
                    //Binary G
                    Binary.setG(1000111);
                    textView.setText("--> " + Binary.getG());
                }
                String H="H,h";
                if (H.contains(editText.getText().toString())) {
                    //Binary H
                    Binary.setH(1001000);
                    textView.setText("--> " + Binary.getH());
                }
                String I="I,i";
                if (I.contains(editText.getText().toString())) {
                    //Binary I
                    Binary.setI(1001001);
                    textView.setText("--> " + Binary.getI());
                }
                String J="J,j";
                if (J.contains(editText.getText().toString())) {
                    //Binary J
                    Binary.setJ(1001010);
                    textView.setText("--> " + Binary.getJ());
                }
                String K="K,k";
                if (K.contains(editText.getText().toString())) {
                    //Binary K
                    Binary.setK(1001011);
                    textView.setText("--> " + Binary.getK());
                }
                String L="L,l";
                if (L.contains(editText.getText().toString())) {
                    //Binary L
                    Binary.setL(1001100);
                    textView.setText("--> " + Binary.getL());
                }
                String M="M,m";
                if (M.contains(editText.getText().toString())) {
                    //Binary M
                    Binary.setM(1001101);
                    textView.setText("--> " + Binary.getM());
                }
                String N="N,n";
                if (N.contains(editText.getText().toString())) {
                    //Binary N
                    Binary.setN(1001110);
                    textView.setText("--> " + Binary.getN());
                }
                String O="O,o";
                if (O.contains(editText.getText().toString())) {
                    //Binary O
                    Binary.setO(1001111);
                    textView.setText("--> " + Binary.getO());
                }
                String P="P,p";
                if (P.contains(editText.getText().toString())) {
                    //Binary P
                    Binary.setP(1010000);
                    textView.setText("--> " + Binary.getP());
                }
                String Q="Q,q";
                if (Q.contains(editText.getText().toString())) {
                    //Binary Q
                    Binary.setQ(1010001);
                    textView.setText("--> " + Binary.getQ());
                }
                String R="R,r";
                if (R.contains(editText.getText().toString())) {
                    //Binary R
                    Binary.setR(1010010);
                    textView.setText("--> " + Binary.getR());
                }
                String S="S,s";
                if (S.contains(editText.getText().toString())) {
                    //Binary S
                    Binary.setS(1010011);
                    textView.setText("--> " + Binary.getS());
                }
                String T="T,t";
                if (T.contains(editText.getText().toString())) {
                    //Binary T
                    Binary.setT(1010100);
                    textView.setText("--> " + Binary.getT());
                }
                String U="U,u";
                if (U.contains(editText.getText().toString())) {
                    //Binary U
                    Binary.setU(1010101);
                    textView.setText("--> " + Binary.getU());
                }
                String V="V,v";
                if (V.contains(editText.getText().toString())) {
                    //Binary V
                    Binary.setV(1010110);
                    textView.setText("--> " + Binary.getV());
                }
                String W="W,w";
                if (W.contains(editText.getText().toString())) {
                    //Binary W
                    Binary.setW(1010111);
                    textView.setText("--> " + Binary.getW());
                }
                String X="X,x";
                if (X.contains(editText.getText().toString())) {
                    //Binary X
                    Binary.setX(1011000);
                    textView.setText("--> " + Binary.getX());
                }
                String Y="Y,y";
                if (Y.contains(editText.getText().toString())) {
                    //Binary Y
                    Binary.setY(1011001);
                    textView.setText("--> " + Binary.getY());
                }
                String Z="Z,z";
                if (Z.contains(editText.getText().toString())) {
                    //Binary Z
                    Binary.setZ(1011010);
                    textView.setText("--> " + Binary.getZ());
                }
            }
        });

    }

    public void Telegram(View view)
    {

        Uri uri = Uri.parse("https://t.me/Java_local");
        Intent intent = new Intent(Intent.ACTION_VIEW, uri);
        startActivity(intent);
    }

    public void Instagram(View view)
    {
        Uri uri = Uri.parse("https://www.instagram.com/tonymanvip/");
        Intent intent = new Intent(Intent.ACTION_VIEW, uri);
        startActivity(intent);
    }




}