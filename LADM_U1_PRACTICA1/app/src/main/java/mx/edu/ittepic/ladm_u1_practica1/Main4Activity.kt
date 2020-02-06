package mx.edu.ittepic.ladm_u1_practica1

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Menu
import android.view.MenuItem

class Main4Activity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main4)
    }
    override fun onCreateOptionsMenu(menu: Menu?): Boolean {
        //Este metodo asocia el menu xml con el activity
        menuInflater.inflate(R.menu.menuviews,menu)
        return super.onCreateOptionsMenu(menu)
    }
    override fun onOptionsItemSelected(item: MenuItem): Boolean {


        when(item.itemId){
            R.id.activity1 ->{
                var otraventana= Intent(this,MainActivity::class.java)
                startActivity(otraventana)
                this.finish()
            }//S
            R.id.activity2 ->{  var otraventana2= Intent(this,Main2Activity::class.java)
                startActivity(otraventana2)
                this.finish()
                }//
            R.id.activity3 ->{
                var otraventana3= Intent(this,Main3Activity::class.java)
                startActivity(otraventana3)
                this.finish()
            }//
            R.id.activity4 ->{
                var otraventana4= Intent(this,Main4Activity::class.java)
                startActivity(otraventana4)
                this.finish()
            }//

        }
        return super.onOptionsItemSelected(item)
    }
}
