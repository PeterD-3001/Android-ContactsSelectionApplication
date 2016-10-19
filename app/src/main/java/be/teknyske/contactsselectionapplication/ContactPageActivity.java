package be.teknyske.contactsselectionapplication;

import android.app.Activity;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class ContactPageActivity extends AppCompatActivity implements View.OnClickListener {

    private final int PHONE = 0;
    private final int WEBSITE = 1;

    private TextView contactName;
    private TextView contactPhone;
    private TextView contactWebsite;
    private ContactObject contactObject;

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_contact_page);

        contactName =  (TextView) findViewById(R.id.contactName);
        contactPhone =  (TextView) findViewById(R.id.contactPhone);
        contactWebsite =  (TextView) findViewById(R.id.contactWebsite);

        Bundle extras = getIntent().getExtras();
        if (extras == null) return;
        contactObject = (ContactObject) getIntent().getSerializableExtra("Object");
        contactName.setText(contactObject.getName());
        contactPhone.setText("Phone: "+ contactObject.getPhone());
        contactWebsite.setText("Website: "+contactObject.getWebsite());
        contactPhone.setOnClickListener(this);
        contactWebsite.setOnClickListener(this);

    }

    @Override
    public void onClick (View v)
    {
      switch (v.getId())
        {
            case R.id.contactPhone:
                Intent i = new Intent();
                i.putExtra("value",contactObject.getPhone());
                setResult(PHONE,i);
                finish();
                break;

            case R.id.contactWebsite:
                i = new Intent();
                i.putExtra("value",contactObject.getWebsite());
                setResult(WEBSITE,i);
                finish();
                break;

        }
    }

}
