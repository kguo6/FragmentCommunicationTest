package com.example.android.fragmentcomm;




import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;


public class TextField extends Fragment implements View.OnClickListener{
    public TextField(){
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.text_field,
                container, false);
        Button b = (Button)view.findViewById(R.id.text_field_button);
        b.setOnClickListener(this);
        return view;
    }

    @Override
    public void onClick(View view){
        if(view.getId() == R.id.text_field_button){
            // Fragment Replacement
            Bundle args = new Bundle();
            EditText text = getView().findViewById(R.id.editText);
            args.putString("SubmittedString",text.getText().toString());
            DisplayMessage newFrag = new DisplayMessage();
            newFrag.setArguments(args);

            if(getActivity() instanceof MainActivity) {
                MainActivity temp = (MainActivity) getActivity();
                temp.replaceFragment(newFrag);
            }







//            InputMethodManager imm = (InputMethodManager) getActivity().getSystemService(Context.INPUT_METHOD_SERVICE);
//            imm.toggleSoftInput(InputMethodManager.SHOW_FORCED, 0);

//            Activity
//            Intent newIntent = new Intent(getActivity(), Activity.class);
//            startActivity(newIntent);
        }

    }




}
