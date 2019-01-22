package com.example.choi.udm;

import android.app.Activity;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup; //
import android.widget.ProgressBar;
import android.widget.TextView;

import java.util.List;

public class RecyclerViewAdapter extends RecyclerView.Adapter<RecyclerViewAdapter.ViewHolder> {
    private Activity activity;
    private List<Compo> compo;
    private MainActivity ac;


    public RecyclerViewAdapter(Activity activity, List<Compo> compo) {
        this.activity = activity;
        this.compo = compo;
    }

    @Override
    public int getItemCount() {
        return compo.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        TextView name;
        ProgressBar oee;
        TextView a;
        TextView p;
        TextView q;
        ProgressBar aa;
        ProgressBar pp;
        ProgressBar qq;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            name = itemView.findViewById(R.id.tv_line);
            oee = itemView.findViewById(R.id.tv_oee);
            a = itemView.findViewById(R.id.aaa);             //TextView
            p = itemView.findViewById(R.id.ppp);            //TextView
            q = itemView.findViewById(R.id.qqq);                //TextView

            aa = itemView.findViewById(R.id.aa);                //Progress
            pp = itemView.findViewById(R.id.pp);                 //Progress
            qq = itemView.findViewById(R.id.qq);           //Progress
        }
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        View view = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.recycler_main, viewGroup, false);
        ViewHolder viewHolder = new ViewHolder(view);
        return viewHolder;

    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder viewHolder, int i) {
        Compo data = compo.get(i);

        // 데이터 결합
        viewHolder.name.setText(data.getName());
        viewHolder.aa.setProgress(data.getA());
        viewHolder.pp.setProgress(data.getP());
        viewHolder.qq.setProgress(data.getQ());

        viewHolder.oee.setProgress(data.getOee());
        viewHolder.a.setText(data.getA() + "%");
        viewHolder.p.setText(data.getP() + "%");
        viewHolder.q.setText(data.getQ() + "%");
    }


    private void removeItemView(int position) {
        compo.remove(position);
        notifyItemRemoved(position);
        notifyItemRangeChanged(position, compo.size()); // 지워진 만큼 다시 채워넣기.
    }

}