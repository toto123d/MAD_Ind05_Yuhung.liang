import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

class MADDetailActivity : AppCompatActivity() {

    private lateinit var selectedItemTextView: TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_mad_detail)

        selectedItemTextView = findViewById(R.id.selectedItemTextView)
        val selectedItem = intent.getStringExtra("selectedItem")
        selectedItemTextView.text = selectedItem
    }
}
