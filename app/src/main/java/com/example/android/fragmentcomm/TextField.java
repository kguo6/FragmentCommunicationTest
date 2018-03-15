package com.example.android.fragmentcomm;




import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentTransaction;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;


public class TextField extends Fragment implements View.OnClickListener{
    SubmitStringListener mCallBack;
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
    public void onAttach(Context context){
        super.onAttach(context);
        try{
            mCallBack = (SubmitStringListener) context;
        } catch (ClassCastException e){
            throw new ClassCastException(context.toString()
                    + "must implement SubmitStringListener");
        }
    }

    @Override
    public void onClick(View view){
        if(view.getId() == R.id.text_field_button){
            // Fragment Replacement
            Bundle args = new Bundle();
            EditText text = getView().findViewById(R.id.editText);

            args.putString("SubmittedString",text.getText().toString());

            FragmentTransaction transaction= getActivity().getSupportFragmentManager().beginTransaction();
            DisplayMessage newFrag = new DisplayMessage();

            newFrag.setArguments(args);

            transaction.replace(R.id.fragment_container, newFrag);
            transaction.addToBackStack(null);
            transaction.commit();

            // new Activity
//            Intent newIntent = new Intent(getActivity(), Activity.class);
//            startActivity(newIntent);
        }
    }

    public interface SubmitStringListener{
        public void submitString(String string);
    }


}
