package space.eliseev.firstapp;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class GameLevels extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.gamelevels);

        Window w = getWindow();
        w.setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,WindowManager.LayoutParams.FLAG_FULLSCREEN);

        Button button_back = (Button)findViewById(R.id.button_back);
        button_back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //команда для кнопки назад
                try {
                    Intent intent = new Intent(GameLevels.this, MainActivity.class);
                    startActivity(intent);finish();
                } catch (Exception e) {

                } // конец конструкции
            }
        });
        //кнопка перехода на первый уровень начало
        TextView textViev1 = (TextView)findViewById(R.id.textView1);
        textViev1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                try {
                    Intent intent = new Intent(GameLevels.this, Level1.class);
                    startActivity(intent);finish();
                } catch (Exception e) {
                    //пусто
                }
            }
        });
        //кнопка перехода на первый уровень конец

        //кнопка перехода на второй уровень начало
        TextView textViev2 = (TextView)findViewById(R.id.textView2);
        textViev2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                try {
                    Intent intent = new Intent(GameLevels.this, Level2.class);
                    startActivity(intent);finish();
                } catch (Exception e) {
                    //пусто
                }
            }
        });
        //кнопка перехода на второй уровень конец

//кнопка перехода на третий уровень начало
        TextView textViev3 = (TextView)findViewById(R.id.textView3);
        textViev3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                try {
                    Intent intent = new Intent(GameLevels.this, Level3.class);
                    startActivity(intent);finish();
                } catch (Exception e) {
                    //пусто
                }
            }
        });
        //кнопка перехода на третий уровень конец

        //кнопка перехода на четвёртый уровень начало
        TextView textViev4 = (TextView)findViewById(R.id.textView4);
        textViev4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                try {
                    Intent intent = new Intent(GameLevels.this, Level4.class);
                    startActivity(intent);finish();
                } catch (Exception e) {
                    //пусто
                }
            }
        });
        //кнопка перехода на четвёртый уровень конец

    }
    //системная кнопка "назад" начало

    @Override
    public void onBackPressed() {
        //команда для кнопки назад
        try {
            Intent intent = new Intent(GameLevels.this, MainActivity.class);
            startActivity(intent);finish();
        } catch (Exception e) {

        } // конец конструкции
    }

    //системная кнопка "назад" конец
}