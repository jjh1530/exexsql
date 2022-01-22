
package com.example.exexsql;

import android.app.AlertDialog;
import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;

public class Adapter extends RecyclerView.Adapter<Adapter.ViewHolder> {

    private ArrayList<money> mSunList;
    private Context mContext;
    private com.example.exexsql.DBHelper mDBHelper;

    public Adapter(ArrayList<money> mSunList, Context mContext) {
        this.mSunList = mSunList;
        this.mContext = mContext;
        mDBHelper = new DBHelper(mContext);
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType)
    {
        View holder = LayoutInflater.from(parent.getContext()).inflate(R.layout.sun_list, parent, false);
        return new ViewHolder(holder);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position)
    {
        holder.tv_day.setText(mSunList.get(position).getday());
        holder.tv_month.setText(mSunList.get(position).getmonth());
        holder.tv_daym.setText(mSunList.get(position).getdaym());
        holder.tv_monthm.setText((mSunList.get(position).getmonthm()));

    }

    @Override
    public int getItemCount() {
        return mSunList.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {

        private TextView tv_day;
        private TextView tv_month;
        private TextView tv_daym;
        private TextView tv_monthm;



        public ViewHolder(@NonNull View itemView) {
            super(itemView);

            tv_day = itemView.findViewById(R.id.tv_day);
            tv_month = itemView.findViewById(R.id.tv_month);
            tv_daym = itemView.findViewById(R.id.tv_daym);
            tv_monthm = itemView.findViewById(R.id.tv_monthm);



            itemView.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v)
                {
                    int curPos = getAdapterPosition();
                    com.example.exexsql.money SunList = mSunList.get(curPos);

                    String[] strChoiceItems = {"수정하기", "삭제하기"};
                    AlertDialog.Builder builder = new AlertDialog.Builder(mContext);
                    builder.setTitle("원하는 작업을 선택");
                    builder.setItems(strChoiceItems, new DialogInterface.OnClickListener() {
                        @Override
                        public void onClick(DialogInterface dialogInterface, int position) {
                            if(position == 0) {
                                // 수정하기
                                //팝업창 띄우기
                                Dialog dialog = new Dialog(mContext, android.R.style.Theme_Material_Light_Dialog);
                                dialog.setContentView(R.layout.adit);
                                EditText et_day = dialog.findViewById(R.id.et_day);
                                EditText et_month = dialog.findViewById(R.id.et_month);
                                EditText et_daym = dialog.findViewById(R.id.et_daym);
                                EditText et_monthm = dialog.findViewById(R.id.et_monthm);
                                Button btn_OK =  dialog.findViewById(R.id.btn_ok);

                                btn_OK.setOnClickListener(new View.OnClickListener() {
                                    @Override
                                    public void onClick(View v) {
                                        String day = et_day.getText().toString();
                                        String month = et_month.getText().toString();
                                        String daym = et_daym.getText().toString();
                                        String monthm = et_monthm.getText().toString();
                                        String currentTime = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").format(new Date());
                                        String beforeTime = SunList.getWriteDate();

                                        mDBHelper.UpdateSun(day, month,daym, monthm,currentTime,beforeTime);

                                        // UI 변경
                                        SunList.setday(day);
                                        SunList.setmonth(month);
                                        SunList.setdaym(daym);
                                        SunList.setmonthm(monthm);
                                        notifyItemChanged(curPos, SunList);
                                        dialog.dismiss();
                                        Toast.makeText(mContext,"목록 수정이 완료", Toast.LENGTH_SHORT).show();

                                    }
                                });

                                dialog.show();

                            }
                            else if(position ==1) {
                                //삭제하기
                                String beforTime = SunList.getWriteDate();
                                mDBHelper.DeleteSun(beforTime);
                                //UI 제거
                                mSunList.remove(curPos);
                                notifyItemChanged(curPos);
                                Toast.makeText(mContext,"목록이 제거", Toast.LENGTH_SHORT).show();

                            }

                        }
                    });
                    builder.show();
                }
            });
        }
    }

    public void addItem(com.example.exexsql.money _item) {
        mSunList.add(0, _item);
        notifyItemInserted(0);
    }
}
