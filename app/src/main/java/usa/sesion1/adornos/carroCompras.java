package usa.sesion1.adornos;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import com.google.android.material.snackbar.Snackbar;

import usa.sesion1.adornos.databinding.ActivityMainBinding;
import usa.sesion1.adornos.databinding.FragmentHomeBinding;

public class carroCompras extends AppCompatActivity {

     Button comprar;
    private ActivityMainBinding binding;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        binding = ActivityMainBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        setSupportActionBar(binding.appBarMain.toolbar);
        binding.appBarMain.fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view, "♥♥♥", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();
            }
        });
}
}
