package com.example.user.exrecyclerview2;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import java.util.List;

public class ProAdapter extends RecyclerView.Adapter<ProAdapter.ProViewHolder> {
    private List<Professor> professorList;
    private Context context;

    public ProAdapter(List<Professor> professorList, Context context) {
        this.professorList = professorList;
        this.context = context;
    }

    @NonNull
    @Override
    public ProAdapter.ProViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        LayoutInflater inflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        View view = inflater.inflate(R.layout.professor, viewGroup, false);
        return new ProViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ProAdapter.ProViewHolder proViewHolder, int i) {
        proViewHolder.name.setText(professorList.get(i).getName());
        proViewHolder.major.setText(professorList.get(i).getMajor());
        proViewHolder.email.setText(professorList.get(i).getEmail());
    }

    @Override
    public int getItemCount() {
        return professorList.size();
    }

    public class ProViewHolder extends RecyclerView.ViewHolder {
        TextView name;
        TextView major;
        TextView email;

        public ProViewHolder(@NonNull View itemView) {
            super(itemView);
            name = itemView.findViewById(R.id.name);
            major = itemView.findViewById(R.id.major);
            email = itemView.findViewById(R.id.email);
        }
    }
}
