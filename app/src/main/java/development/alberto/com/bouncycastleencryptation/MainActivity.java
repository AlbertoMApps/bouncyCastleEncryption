package development.alberto.com.bouncycastleencryptation;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;

import java.security.Security;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        encryptionMethod();
    }
    private void encryptionMethod(){
//        Security.insertProviderAt(new BouncyCastleProvider(), 1);

        String passphrase = "The quick brown fox jumped over the lazy brown dog";
        String plaintext = "hello world";
        byte [] ciphertext = new byte[0];
        try {
            ciphertext = EncryptationClass.encrypt(passphrase, plaintext);
            String recoveredPlaintext = EncryptationClass.decrypt(passphrase, ciphertext);
            Log.i("TAG", recoveredPlaintext);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
