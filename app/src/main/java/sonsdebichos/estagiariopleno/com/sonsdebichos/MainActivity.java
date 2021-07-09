package sonsdebichos.estagiariopleno.com.sonsdebichos;

import android.app.Activity;
import android.media.Image;
import android.media.MediaPlayer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.style.IconMarginSpan;
import android.view.View;
import android.widget.ImageView;

public class MainActivity extends Activity implements View.OnClickListener {

    //Componentes
    private MediaPlayer mediaPlayer;
    private ImageView botaoCao;
    private ImageView botaoGato;
    private ImageView botaoLeao;
    private ImageView botaoMacaco;
    private ImageView botaoVaca;
    private ImageView botaoOvelha;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //Recuperação dos IDs
        botaoCao = (ImageView) findViewById(R.id.botaoCaoId);
        botaoGato = (ImageView) findViewById(R.id.botaoGatoId);
        botaoLeao = (ImageView) findViewById(R.id.botaoLeaoId);
        botaoMacaco = (ImageView) findViewById(R.id.botaoMacacoId);
        botaoVaca = (ImageView) findViewById(R.id.botaoVacaId);
        botaoOvelha = (ImageView) findViewById(R.id.botaoOvelhaId);

        /* Foi utilizado o método de interface implements View.OnClickListener para capturar o botão clicado,
        ao invés de repetir código, o mesmo irá capturar o id da imagem clicada, através de uma função apenas,
        "public void onClick(View view)
         */

        //Evento de click
        botaoCao.setOnClickListener(this);
        botaoGato.setOnClickListener(this);
        botaoLeao.setOnClickListener(this);
        botaoMacaco.setOnClickListener(this);
        botaoVaca.setOnClickListener(this);
        botaoOvelha.setOnClickListener(this);

    }

    @Override
    public void onClick(View view) {
        //Verifica o id capturado, e efetua as ações necessárias
        switch (view.getId()) {
            case R.id.botaoCaoId:
                mediaPlayer = MediaPlayer.create(MainActivity.this,R.raw.cao);
                tocarSom();
                break;
            case R.id.botaoGatoId:
                mediaPlayer = MediaPlayer.create(MainActivity.this,R.raw.gato);
                tocarSom();
                break;
            case R.id.botaoLeaoId:
                mediaPlayer = MediaPlayer.create(MainActivity.this,R.raw.leao);
                tocarSom();
                break;
            case R.id.botaoMacacoId:
                mediaPlayer = MediaPlayer.create(MainActivity.this,R.raw.macaco);
                tocarSom();
                break;
            case R.id.botaoVacaId:
                mediaPlayer = MediaPlayer.create(MainActivity.this,R.raw.vaca);
                tocarSom();
                break;
            case R.id.botaoOvelhaId:
                mediaPlayer = MediaPlayer.create(MainActivity.this,R.raw.ovelha);
                tocarSom();
                break;
        }
    }

    @Override
    protected void onDestroy() {
        if (mediaPlayer!=null){
            mediaPlayer.release();
            mediaPlayer = null;
        }
        super.onDestroy();
    }

    private void tocarSom(){
        if (mediaPlayer != null){
            mediaPlayer.start();
        }
    }
}
