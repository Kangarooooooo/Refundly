package eirik.refundly;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.support.v4.app.Fragment;
import android.widget.Button;

public class MenuFragment extends Fragment implements View.OnClickListener{

    Button login;
    @Override
    public View onCreateView(LayoutInflater i, ViewGroup container, Bundle savedInstanceState) {
        View rod = i.inflate(R.layout.menu_fragment, container, false);
        login = (Button)rod.findViewById(R.id.button);
        login.setOnClickListener(this);
        return rod;
    }

    public void onClick(View v){
        getFragmentManager().beginTransaction()
                .replace(R.id.fragmentindhold, new LoginFragment())
                .addToBackStack(null)
                .commit();
    }
}
