package com.example.tugas_sensor_2023_akb_if2_10120079.adapter;

// 10120079_AZHAR ALFAINI_IF2
// 10120079_AZHAR ALFAINI_IF2
// 10120079_AZHAR ALFAINI_IF2

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.viewpager2.adapter.FragmentStateAdapter;

import java.util.ArrayList;

public class AdapterViewPager extends FragmentStateAdapter {
    ArrayList<Fragment> arr;
    public AdapterViewPager(@NonNull FragmentActivity fragmentActivity, ArrayList<Fragment> arr) {
        super(fragmentActivity);
        this.arr = arr;
    }

    @NonNull
    @Override
    public Fragment createFragment(int position) {
        return arr.get(position);
    }

    @Override
    public int getItemCount() {
        return arr.size();
    }
}