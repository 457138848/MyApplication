package com.example.weiyuan.myapplication;

import android.app.Activity;
import android.os.Bundle;
import android.widget.ListView;
import android.widget.SimpleAdapter;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

/**
 * Created by WeiYuan on 2017/8/29.
 */

public class PlanListActivity {
    public class MainActivity extends Activity {
        private PersonService service;

        @Override
        public void onCreate(Bundle savedInstanceState) {
            super.onCreate(savedInstanceState);
            setContentView(R.layout.plan_list_main);
            service = new PersonService(this);
            ListView listView = (ListView) this.findViewById(R.id.listView);

            //获取到集合数据
            List<Person> persons = service.getScrollData(0, 10);
            List<HashMap<String, Object>> data = new ArrayList<HashMap<String,Object>>();
            for(Person person : persons){
                HashMap<String, Object> item = new HashMap<String, Object>();
                item.put("id", person.getId());
                item.put("name", person.getName());
                item.put("phone", person.getPhone());
                item.put("amount", person.getAmount());
                data.add(item);
            }
            //创建SimpleAdapter适配器将数据绑定到item显示控件上
            SimpleAdapter adapter = new SimpleAdapter(this, data, R.layout.item,
                    new String[]{"name", "phone", "amount"}, new int[]{R.id.name, R.id.phone, R.id.amount});
            //实现列表的显示
            listView.setAdapter(adapter);
            //条目点击事件
            listView.setOnItemClickListener(new ItemClickListener());
        }
        //获取点击事件
        private final class ItemClickListener implements OnItemClickListener{

            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                ListView listView = (ListView) parent;
                HashMap<String, Object> data = (HashMap<String, Object>) listView.getItemAtPosition(position);
                String personid = data.get("id").toString();
                Toast.makeText(getApplicationContext(), personid, 1).show();
            }
        }
    }

}
