package com.example.navigation.ui.photo;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.ViewModelProvider;

import com.example.navigation.databinding.FragmentVideoPhotoBinding;

public class PhotoVideoFragment extends Fragment {

    private FragmentVideoPhotoBinding binding;

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        PhotoVideoViewModel dashboardViewModel =
                new ViewModelProvider(this).get(PhotoVideoViewModel.class);

        binding = FragmentVideoPhotoBinding.inflate(inflater, container, false);
        View root = binding.getRoot();
        return root;
    }

    @Override
    public void onDestroyView() {
        super.onDestroyView();
        binding = null;
    }
}