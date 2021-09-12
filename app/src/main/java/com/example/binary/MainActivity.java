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
        //Set button alpha to zero
        Convert_btn.setAlpha(0f);
        //Animate the alpha value to 1f and set duration as 1.5 secs.
        Convert_btn.animate().alpha(1f).setDuration(1500);

        Convert_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                editText = findViewById(R.id.GetBinary);
                String YY="a,b,c,d,e,f,g,h,i,j,k,l,m,n,o,p,q,r,s,t,u,v,w,x,y,z,A,B,C,D,E,F,G,H,I,J,K,L,M,N,O,P,Q,R,S,T,U,V,W,X,Y,Z";
                if (YY.contains(editText.getText().toString()))
                {
                    if (editText.getText().toString().contains("a")) { textView.setText("01100001"); }
                    if (editText.getText().toString().contains("b")) { textView.setText("01100010"); }
                    if (editText.getText().toString().contains("c")) { textView.setText("01100011"); }
                    if (editText.getText().toString().contains("d")) { textView.setText("01100100"); }
                    if (editText.getText().toString().contains("e")) { textView.setText("01100101"); }
                    if (editText.getText().toString().contains("f")) { textView.setText("01100110"); }
                    if (editText.getText().toString().contains("g")) { textView.setText("01100111"); }
                    if (editText.getText().toString().contains("h")) { textView.setText("01101000"); }
                    if (editText.getText().toString().contains("i")) { textView.setText("01101001"); }
                    if (editText.getText().toString().contains("j")) { textView.setText("01101010"); }
                    if (editText.getText().toString().contains("k")) { textView.setText("01101011"); }
                    if (editText.getText().toString().contains("l")) { textView.setText("01101100"); }
                    if (editText.getText().toString().contains("m")) { textView.setText("01101101"); }
                    if (editText.getText().toString().contains("n")) { textView.setText("01101110"); }
                    if (editText.getText().toString().contains("o")) { textView.setText("01101111"); }
                    if (editText.getText().toString().contains("p")) { textView.setText("01110000"); }
                    if (editText.getText().toString().contains("q")) { textView.setText("01110001"); }
                    if (editText.getText().toString().contains("r")) { textView.setText("01110010"); }
                    if (editText.getText().toString().contains("s")) { textView.setText("01110011"); }
                    if (editText.getText().toString().contains("t")) { textView.setText("01110100"); }
                    if (editText.getText().toString().contains("u")) { textView.setText("01110101"); }
                    if (editText.getText().toString().contains("v")) { textView.setText("01110110"); }
                    if (editText.getText().toString().contains("w")) { textView.setText("01110111"); }
                    if (editText.getText().toString().contains("x")) { textView.setText("01111000"); }
                    if (editText.getText().toString().contains("y")) { textView.setText("01111001"); }
                    if (editText.getText().toString().contains("z")) { textView.setText("01111010"); }
                    //Capppppppppsssssssssssss
                    if (editText.getText().toString().contains("A")) { textView.setText("01000001"); }
                    if (editText.getText().toString().contains("B")) { textView.setText("01000010"); }
                    if (editText.getText().toString().contains("C")) { textView.setText("01000011"); }
                    if (editText.getText().toString().contains("D")) { textView.setText("01000100"); }
                    if (editText.getText().toString().contains("E")) { textView.setText("01000101"); }
                    if (editText.getText().toString().contains("F")) { textView.setText("01000110"); }
                    if (editText.getText().toString().contains("G")) { textView.setText("01000111"); }
                    if (editText.getText().toString().contains("H")) { textView.setText("01001000"); }
                    if (editText.getText().toString().contains("I")) { textView.setText("01001001"); }
                    if (editText.getText().toString().contains("J")) { textView.setText("01001010"); }
                    if (editText.getText().toString().contains("K")) { textView.setText("01001011"); }
                    if (editText.getText().toString().contains("L")) { textView.setText("01001100"); }
                    if (editText.getText().toString().contains("M")) { textView.setText("01001101"); }
                    if (editText.getText().toString().contains("N")) { textView.setText("01001110"); }
                    if (editText.getText().toString().contains("O")) { textView.setText("01001111"); }
                    if (editText.getText().toString().contains("P")) { textView.setText("01010000"); }
                    if (editText.getText().toString().contains("Q")) { textView.setText("01010001"); }
                    if (editText.getText().toString().contains("R")) { textView.setText("01010010"); }
                    if (editText.getText().toString().contains("S")) { textView.setText("01010011"); }
                    if (editText.getText().toString().contains("T")) { textView.setText("01010100"); }
                    if (editText.getText().toString().contains("U")) { textView.setText("01010101"); }
                    if (editText.getText().toString().contains("V")) { textView.setText("01010110"); }
                    if (editText.getText().toString().contains("W")) { textView.setText("01010111"); }
                    if (editText.getText().toString().contains("X")) { textView.setText("01011000"); }
                    if (editText.getText().toString().contains("Y")) { textView.setText("01011001"); }
                    if (editText.getText().toString().contains("Z")) { textView.setText("01011010"); }

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