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
        Toast.makeText(this, "Please Write CAPS", Toast.LENGTH_LONG).show();
        textView = findViewById(R.id.showBinary);
        Convert_btn = findViewById(R.id.Convert_btn);
        Binary Binary = new Binary();

        Convert_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                editText = findViewById(R.id.GetBinary);
                if (editText.getText().toString().equals("A")) {
                    //Binary A
                    Binary.setA(1000001);
                    textView.setText("--> " + Binary.getA());
                }
                if (editText.getText().toString().equals("B")) {
                    //Binary B
                    Binary.setB(1000010);
                    textView.setText("--> " + Binary.getB());
                }
                if (editText.getText().toString().equals("C")) {
                    //Binary C
                    Binary.setC(1000011);
                    textView.setText("--> " + Binary.getC());

                }
                if (editText.getText().toString().equals("D")) {
                    //Binary D
                    Binary.setD(1000100);
                    textView.setText("--> " + Binary.getD());

                }
                if (editText.getText().toString().equals("E")) {
                    //Binary E
                    Binary.setE(1000101);
                    textView.setText("--> " + Binary.getE());
                }

                if (editText.getText().toString().equals("F")) {
                    //Binary F
                    Binary.setF(1000110);
                    textView.setText("--> " + Binary.getF());
                }

                if (editText.getText().toString().equals("G")) {
                    //Binary G
                    Binary.setG(1000111);
                    textView.setText("--> " + Binary.getG());
                }

                if (editText.getText().toString().equals("H")) {
                    //Binary H
                    Binary.setH(1001000);
                    textView.setText("--> " + Binary.getH());
                }
                if (editText.getText().toString().equals("I")) {
                    //Binary I
                    Binary.setI(1001001);
                    textView.setText("--> " + Binary.getI());
                }
                if (editText.getText().toString().equals("J")) {
                    //Binary J
                    Binary.setJ(1001010);
                    textView.setText("--> " + Binary.getJ());
                }
                if (editText.getText().toString().equals("K")) {
                    //Binary K
                    Binary.setK(1001011);
                    textView.setText("--> " + Binary.getK());
                }
                if (editText.getText().toString().equals("L")) {
                    //Binary L
                    Binary.setL(1001100);
                    textView.setText("--> " + Binary.getL());
                }
                if (editText.getText().toString().equals("M")) {
                    //Binary M
                    Binary.setM(1001101);
                    textView.setText("--> " + Binary.getM());
                }
                if (editText.getText().toString().equals("N")) {
                    //Binary N
                    Binary.setN(1001110);
                    textView.setText("--> " + Binary.getN());
                }
                if (editText.getText().toString().equals("O")) {
                    //Binary O
                    Binary.setO(1001111);
                    textView.setText("--> " + Binary.getO());
                }
                if (editText.getText().toString().equals("P")) {
                    //Binary P
                    Binary.setP(1010000);
                    textView.setText("--> " + Binary.getP());
                }
                if (editText.getText().toString().equals("Q")) {
                    //Binary Q
                    Binary.setQ(1010001);
                    textView.setText("--> " + Binary.getQ());
                }
                if (editText.getText().toString().equals("R")) {
                    //Binary R
                    Binary.setR(1010010);
                    textView.setText("--> " + Binary.getR());
                }
                if (editText.getText().toString().equals("S")) {
                    //Binary S
                    Binary.setS(1010011);
                    textView.setText("--> " + Binary.getS());
                }
                if (editText.getText().toString().equals("T")) {
                    //Binary T
                    Binary.setT(1010100);
                    textView.setText("--> " + Binary.getT());
                }
                if (editText.getText().toString().equals("U")) {
                    //Binary U
                    Binary.setU(1010101);
                    textView.setText("--> " + Binary.getU());
                }
                if (editText.getText().toString().equals("V")) {
                    //Binary V
                    Binary.setV(1010110);
                    textView.setText("--> " + Binary.getV());
                }
                if (editText.getText().toString().equals("W")) {
                    //Binary W
                    Binary.setW(1010111);
                    textView.setText("--> " + Binary.getW());
                }
                if (editText.getText().toString().equals("X")) {
                    //Binary X
                    Binary.setX(1011000);
                    textView.setText("--> " + Binary.getX());
                }
                if (editText.getText().toString().equals("Y")) {
                    //Binary Y
                    Binary.setY(1011001);
                    textView.setText("--> " + Binary.getY());
                }
                if (editText.getText().toString().equals("Z")) {
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