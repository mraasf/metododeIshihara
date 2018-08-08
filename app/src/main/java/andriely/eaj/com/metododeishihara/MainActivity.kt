package andriely.eaj.com.metododeishihara

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.EditText
import android.widget.ImageView

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_tela01)
        Botao01();
        Botao02();
        Botao03();



    }
    private fun Botao01(any: Any, function: () -> Unit): Any {
        val intent = Intent(this, Tela02Activity::class.java)
        val params = Bundle()

        startActivity(intent)

        // Altera a imagem do imageview
        val imagem03 = findViewById(R.id.imageView) as ImageView
        imagem03.setImageResource(R.drawable.teste3)

    }
    private fun Botao02(any: Any, function: () -> Unit): Any {
        val intent = Intent(this, Tela02Activity::class.java)
        val params = Bundle()

        startActivity(intent)

        // Altera a imagem do imageview
        val imagem03 = findViewById(R.id.imageView) as ImageView
        imagem03.setImageResource(R.drawable.teste3)

    }

    private fun Botao03(any: Any, function: () -> Unit): Any {
        val intent = Intent(this, Tela02Activity::class.java)
        val params = Bundle()

        startActivity(intent)

        // Altera a imagem do imageview
        val imagem03 = findViewById(R.id.imageView) as ImageView
        imagem03.setImageResource(R.drawable.teste3)

    }
}
