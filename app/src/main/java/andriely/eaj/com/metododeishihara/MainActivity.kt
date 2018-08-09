package andriely.eaj.com.metododeishihara

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.ImageView
import kotlinx.android.synthetic.main.activity_tela02.*


class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_tela01)

        val Teste1 = findViewById(R.id.BtnTeste01);
        val Teste2 = findViewById(R.id.BtnTeste02)
        val Teste3 = findViewById(R.id.BtnTeste03)


        val intent = Intent(applicationContext, tela02::class.java)




        Teste1(View v) {

            Intent intent = new Intent(getApplicationContext(), tela02.class);
            // Altera a imagem do imageview
            val imagem01 = findViewById(R.id.imageView) as ImageView
            imagem01.setImageResource(R.drawable.teste1)
        }
        Teste2(View v) {

            Intent intent = new Intent(getApplicationContext(), tela02.class);
            // Altera a imagem do imageview
            val imagem03 = findViewById(R.id.imageView) as ImageView
            imagem03.setImageResource(R.drawable.teste2)
        }

        Teste3(View v) {

            Intent intent = new Intent(getApplicationContext(), tela02.class);
            // Altera a imagem do imageview
            val imagem03 = findViewById(R.id.imageView) as ImageView
            imagem03.setImageResource(R.drawable.teste3)
        }


    }
}
