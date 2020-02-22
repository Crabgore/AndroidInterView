package ru.crabgore.androidinterview.t1;


import android.content.Context;
import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Toast;

import ru.crabgore.androidinterview.R;

public class BlankFragment extends Fragment {

    public BlankFragment() {}

    @Override
    public void onAttach(@NonNull Context context) {
        super.onAttach(context);
        showToast("onAttach");
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        showToast("onCreateView");
        return inflater.inflate(R.layout.fragment_blank, container, false);
    }

    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
        showToast("onActivityCreated");
    }

    @Override
    public void onStart() {
        super.onStart();
        showToast("onStart");
    }

    @Override
    public void onResume() {
        super.onResume();
        showToast("onResume");
    }

    @Override
    public void onPause() {
        super.onPause();
        showToast("onPause");
    }

    @Override
    public void onStop() {
        super.onStop();
        showToast("onStop");
    }

    @Override
    public void onDestroyView() {
        super.onDestroyView();
        showToast("onDestroyView");
    }

    @Override
    public void onDestroy() {
        super.onDestroy();
        showToast("onDestroy");
    }

    @Override
    public void onDetach() {
        super.onDetach();
        showToast("onDetach");
    }

    private void showToast(String message) {
        Toast.makeText(getContext(), message, Toast.LENGTH_SHORT).show();
    }
}
