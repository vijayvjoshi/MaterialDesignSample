package com.example.dell;


import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;


/**
 * A simple {@link Fragment} subclass.
 * Use the {@link ChatFragment#newInstance} factory method to
 * create an instance of this fragment.
 */
public class ChatFragment extends Fragment {


    private RecyclerView mRecyclerView;
    private RecyclerView.LayoutManager mLayoutManager;
    private RecyclerView.Adapter mAdapter;

    private Context mContext;

    /**
     * Use this factory method to create a new instance of
     * this fragment using the provided parameters.
     *
     * @return A new instance of fragment ChatFragment.
     */
    public static ChatFragment newInstance() {
        ChatFragment fragment = new ChatFragment();
        return fragment;
    }

    public ChatFragment() {
        // Required empty public constructor
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Override
    public void onAttach(Activity activity) {
        super.onAttach(activity);
        mContext = activity;
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View rootView = inflater.inflate(R.layout.fragment_chat,
                container, false);

        mRecyclerView = (RecyclerView) rootView.findViewById(R.id.chat_recycler_view);

        // use this setting to improve performance if you know that changes
        // in content do not change the layout size of the RecyclerView
        mRecyclerView.setHasFixedSize(true);

        // use a linear layout manager
        mLayoutManager = new LinearLayoutManager(mContext);
        mRecyclerView.setLayoutManager(mLayoutManager);

        String[] myDataset = new String[]{"Vijay Joshi", "Vijay Joshi", "Vijay Joshi", "Vijay Joshi","Vijay Joshi", "Vijay Joshi", "Vijay Joshi", "Vijay Joshi","Vijay Joshi", "Vijay Joshi", "Vijay Joshi", "Vijay Joshi","Vijay Joshi", "Vijay Joshi", "Vijay Joshi", "Vijay Joshi","Vijay Joshi", "Vijay Joshi", "Vijay Joshi", "Vijay Joshi","Vijay Joshi", "Vijay Joshi", "Vijay Joshi", "Vijay Joshi","Vijay Joshi", "Vijay Joshi", "Vijay Joshi", "Vijay Joshi","Vijay Joshi", "Vijay Joshi", "Vijay Joshi", "Vijay Joshi","Vijay Joshi", "Vijay Joshi", "Vijay Joshi", "Vijay Joshi","Vijay Joshi", "Vijay Joshi", "Vijay Joshi", "Vijay Joshi","Vijay Joshi", "Vijay Joshi", "Vijay Joshi", "Vijay Joshi","Vijay Joshi", "Vijay Joshi", "Vijay Joshi", "Vijay Joshi","Vijay Joshi", "Vijay Joshi", "Vijay Joshi", "Vijay Joshi"};
        mAdapter = new ChatAdapter(myDataset);
        mRecyclerView.setAdapter(mAdapter);
        mRecyclerView.addItemDecoration(new DividerItemDecoration(mContext));
        return rootView;
    }


}
