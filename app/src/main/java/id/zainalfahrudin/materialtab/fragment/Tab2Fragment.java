package id.zainalfahrudin.materialtab.fragment;


import android.os.Bundle;
import android.support.design.widget.Snackbar;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.Toast;
import id.zainalfahrudin.materialtab.R;

public class Tab2Fragment extends Fragment {

    private Button btnClickMe;

    public Tab2Fragment() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_tab2, container, false);
        btnClickMe = (Button)view.findViewById(R.id.btn_click_me);
        return view;
    }

    @Override
    public void onActivityCreated(Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
        btnClickMe.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(getActivity(), "Hola", Toast.LENGTH_LONG).show();
//                Snackbar.make(btnClickMe, "Hola", Snackbar.LENGTH_SHORT).show();
            }
        });
    }
}