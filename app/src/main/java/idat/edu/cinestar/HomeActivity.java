package idat.edu.cinestar;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentTransaction;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;

import com.google.android.material.bottomnavigation.BottomNavigationView;

public class HomeActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);


        BottomNavigationView  bnvNavegar = findViewById(R.id.bnvNavegar);

        bnvNavegar.setOnNavigationItemSelectedListener(new BottomNavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem item) {

                loadFragment(item.getItemId());
                return true;
            }
        });

        loadFragment(R.id.optInicio);
    }


    private void loadFragment(int itemId)
    {
        Fragment fragment = new Fragment();

        switch (itemId)
        {
            case R.id.optInicio:
                fragment = new InicioFragment();
                break;
            case R.id.optCartelera:
                fragment = new CarteleraFragment();
                break;
            case R.id.optProximos:
                fragment = new ProximoFragment();
                break;
        }

        FragmentTransaction transaction = getSupportFragmentManager().beginTransaction();
        transaction.replace(R.id.frmContenedor, fragment);
        transaction.addToBackStack(null);
        transaction.commit();


    }

}