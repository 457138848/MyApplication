package com.example.weiyuan.myapplication;

import android.app.AlertDialog;
import android.app.LoaderManager;
import android.content.Context;
import android.content.Intent;
import android.content.Loader;
import android.database.Cursor;
import android.os.Bundle;
import android.os.StrictMode;
import android.support.v7.app.AppCompatActivity;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.inputmethod.EditorInfo;
import android.widget.AdapterView;
import android.widget.AutoCompleteTextView;
import android.widget.BaseAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.GridView;
import android.widget.ImageView;
import android.widget.TextView;

/**
 * Created by WeiYuan on 2017/8/29.
 */

public class FunctionListActivity   extends AppCompatActivity implements LoaderManager.LoaderCallbacks<Cursor>, AdapterView.OnItemClickListener {
    private int[] images = {R.mipmap.project_plan,R.mipmap.plane,R.mipmap.task_managers,R.mipmap.emblem_special,
            R.mipmap.matte_shouhut,R.mipmap.zhixing,R.mipmap.toolst,
            R.mipmap.check,R.mipmap.dimianshebei,R.mipmap.exchange,
            R.mipmap.webcam_receive};
    private String[] text = {"航班计划","航班动态","任务清单","特殊情况通报","飞机守护任务","生产任务执行","未还工具设备清单","地面设备日常检查","车辆日常检查","交班功能",
            "领料需求"};
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.function_list);
        GridView gridView = (GridView) findViewById(R.id.gridView);
        gridView.setAdapter(new MyAdapter(this,images,text));
        gridView.setOnItemClickListener(FunctionListActivity.this);

    }

    @Override
    public Loader<Cursor> onCreateLoader(int i, Bundle bundle) {
        return null;
    }

    @Override
    public void onLoadFinished(Loader<Cursor> loader, Cursor cursor) {

    }

    @Override
    public void onLoaderReset(Loader<Cursor> loader) {

    }

    @Override
    public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
        switch (i) {
            //航班计划
            case 0:
                new  AlertDialog.Builder(FunctionListActivity.this)
                        .setTitle("航班计划" )
                        .show();
                break;
            case 1:

                new  AlertDialog.Builder(FunctionListActivity.this)
                        .setTitle("航班动态" )
                        .show();
                break;
            default:
                break;
        }
    }

    @Override
    public void onPointerCaptureChanged(boolean hasCapture) {

    }

    private static class MyAdapter extends BaseAdapter {
        private LayoutInflater layoutInflater;
        private int[] images;
        private String[] text;
        public MyAdapter(Context context, int[] images, String[] text){
            this.images = images;
            this.text = text;
            layoutInflater = LayoutInflater.from(context);
        }
        @Override
        public int getCount() {
            return images.length;
        }

        @Override
        public Object getItem(int position) {
            return images[position];
        }

        @Override
        public long getItemId(int position) {
            return position;
        }


        @Override
        public CharSequence[] getAutofillOptions() {
            return new CharSequence[0];
        }

        @Override
        public View getView(int position, View convertView, ViewGroup parent) {
            View v = layoutInflater.inflate(R.layout.function_list_item,null);
            ImageView iv = (ImageView) v.findViewById(R.id.iv_gridView_item);
            TextView tv = (TextView) v.findViewById(R.id.tv_gridView_item);
            iv.setImageResource(images[position]);
            tv.setText(text[position]);
            return v;
        }
    }
}

