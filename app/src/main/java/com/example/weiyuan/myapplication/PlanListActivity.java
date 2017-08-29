package com.example.weiyuan.myapplication;

import android.app.Activity;
import android.app.LoaderManager;
import android.content.Loader;
import android.database.Cursor;
import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.SimpleAdapter;
import android.widget.Toast;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.google.gson.Gson;
import com.google.gson.JsonObject;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import bean.LmPmFlightPlan;
import bean.Result;
import utils.GetPostUtils;

import static android.R.attr.data;
import static constants.constants.SUCCESS_CODE;

/**
 * Created by WeiYuan on 2017/8/29.
 */

public class PlanListActivity extends AppCompatActivity implements LoaderManager.LoaderCallbacks<Cursor>, AdapterView.OnItemClickListener {
    private String msData = "{\"code\":200,\"data\":[{\"acno\":\"21\",\"actArriveDate\":0,\"actype\":\"111111112\",\"base\":\"zppp\",\"boardingGate\":\"2\",\"estArriverDate\":0,\"flightNo\":\"2\",\"modifyBy\":\"1\",\"modifyDate\":1503283622000,\"operateDate\":1502867913000,\"operator\":\"1\",\"pkid\":\"51\",\"plaArriveDate\":0,\"preAirportActDep\":0,\"preAirportEstDepDate\":0,\"preAirportPlaDepDate\":0,\"servStatus\":\"ZJ\"},{\"acno\":\"6235\",\"actArriveDate\":1501387200000,\"actype\":\"A320000000\",\"base\":\"ZPPP\",\"boardingGate\":\"331\",\"carousel\":\"A21\",\"delayReason\":\"22\",\"descript\":\"3\",\"estArriverDate\":1501387200000,\"flightFlag\":\"CA\",\"flightNo\":\"CA1002\",\"flightType\":\"ZJ\",\"flowStatus\":\"1\",\"modifyBy\":\"1\",\"modifyDate\":1502765876000,\"operateDate\":1501744110000,\"operator\":\"系统管理员\",\"pkid\":\"2\",\"plaArriveDate\":1503892800000,\"preAirportActDep\":1501380000000,\"preAirportEstDepDate\":1501380000000,\"preAirportPlaDepDate\":1501380000000,\"servStatus\":\"ZC\",\"startAirportThrCode\":\"PEK\",\"stopoverAirportName\":\"1\",\"synDate\":1501744110000},{\"acno\":\"1\",\"actArriveDate\":-2209186800000,\"actype\":\"1\",\"airline\":\"1\",\"base\":\"1\",\"boardingGate\":\"1\",\"carousel\":\"1\",\"delayReason\":\"1\",\"demo\":\"1\",\"descript\":\"1\",\"estArriverDate\":-2209186800000,\"flightFlag\":\"1\",\"flightNo\":\"1\",\"flightType\":\"1\",\"flowStatus\":\"1\",\"linkFlag\":\"1\",\"modifyBy\":\"1\",\"modifyDate\":-2209186800000,\"operateDate\":-2209186800000,\"operator\":\"1\",\"pkid\":\"10\",\"plaArriveDate\":-2209186800000,\"preAirportActDep\":-2209186800000,\"preAirportEstDepDate\":-2209186800000,\"preAirportPlaDepDate\":-2209186800000,\"servStatus\":\"1\",\"startAirportName\":\"1\",\"startAirportThrCode\":\"1\",\"stopoverAirportName\":\"1\",\"stopoverAirportThrCode\":\"1\",\"synDate\":-2209186800000},{\"acno\":\"1\",\"actArriveDate\":-2209186800000,\"actype\":\"1\",\"airline\":\"1\",\"base\":\"1\",\"boardingGate\":\"1\",\"carousel\":\"1\",\"delayReason\":\"1\",\"demo\":\"1\",\"descript\":\"1\",\"estArriverDate\":-2209186800000,\"flightFlag\":\"1\",\"flightNo\":\"1\",\"flightType\":\"1\",\"flowStatus\":\"1\",\"linkFlag\":\"1\",\"modifyBy\":\"1\",\"modifyDate\":-2209186800000,\"operateDate\":-2209186800000,\"operator\":\"1\",\"pkid\":\"9\",\"plaArriveDate\":-2209186800000,\"preAirportActDep\":-2209186800000,\"preAirportEstDepDate\":-2209186800000,\"preAirportPlaDepDate\":-2209186800000,\"servStatus\":\"1\",\"startAirportName\":\"1\",\"startAirportThrCode\":\"1\",\"stopoverAirportName\":\"1\",\"stopoverAirportThrCode\":\"1\",\"synDate\":-2209186800000},{\"acno\":\"1\",\"actArriveDate\":-2209186800000,\"actype\":\"1\",\"airline\":\"1\",\"base\":\"1\",\"boardingGate\":\"1\",\"carousel\":\"1\",\"delayReason\":\"1\",\"demo\":\"1\",\"descript\":\"1\",\"estArriverDate\":-2209186800000,\"flightFlag\":\"1\",\"flightNo\":\"1\",\"flightType\":\"1\",\"flowStatus\":\"1\",\"linkFlag\":\"1\",\"modifyBy\":\"1\",\"modifyDate\":-2209186800000,\"operateDate\":-2209186800000,\"operator\":\"1\",\"pkid\":\"8\",\"plaArriveDate\":-2209186800000,\"preAirportActDep\":-2209186800000,\"preAirportEstDepDate\":-2209186800000,\"preAirportPlaDepDate\":-2209186800000,\"servStatus\":\"1\",\"startAirportName\":\"1\",\"startAirportThrCode\":\"1\",\"stopoverAirportName\":\"1\",\"stopoverAirportThrCode\":\"1\",\"synDate\":-2209186800000},{\"acno\":\"1\",\"actArriveDate\":-2209186800000,\"actype\":\"1\",\"airline\":\"1\",\"base\":\"1\",\"boardingGate\":\"1\",\"carousel\":\"1\",\"delayReason\":\"1\",\"demo\":\"1\",\"descript\":\"1\",\"estArriverDate\":-2209186800000,\"flightFlag\":\"1\",\"flightNo\":\"1\",\"flightType\":\"1\",\"flowStatus\":\"1\",\"linkFlag\":\"1\",\"modifyBy\":\"1\",\"modifyDate\":-2209186800000,\"operateDate\":-2209186800000,\"operator\":\"1\",\"pkid\":\"7\",\"plaArriveDate\":-2209186800000,\"preAirportActDep\":-2209186800000,\"preAirportEstDepDate\":-2209186800000,\"preAirportPlaDepDate\":-2209186800000,\"servStatus\":\"1\",\"startAirportName\":\"1\",\"startAirportThrCode\":\"1\",\"stopoverAirportName\":\"1\",\"stopoverAirportThrCode\":\"1\",\"synDate\":-2209186800000},{\"acno\":\"1\",\"actArriveDate\":-2209186800000,\"actype\":\"1\",\"airline\":\"1\",\"base\":\"1\",\"boardingGate\":\"1\",\"carousel\":\"1\",\"delayReason\":\"1\",\"demo\":\"1\",\"descript\":\"1\",\"estArriverDate\":-2209186800000,\"flightFlag\":\"1\",\"flightNo\":\"1\",\"flightType\":\"1\",\"flowStatus\":\"1\",\"linkFlag\":\"1\",\"modifyBy\":\"1\",\"modifyDate\":-2209186800000,\"operateDate\":-2209186800000,\"operator\":\"1\",\"pkid\":\"6\",\"plaArriveDate\":-2209186800000,\"preAirportActDep\":-2209186800000,\"preAirportEstDepDate\":-2209186800000,\"preAirportPlaDepDate\":-2209186800000,\"servStatus\":\"1\",\"startAirportName\":\"1\",\"startAirportThrCode\":\"1\",\"stopoverAirportName\":\"1\",\"stopoverAirportThrCode\":\"1\",\"synDate\":-2209186800000},{\"acno\":\"1\",\"actArriveDate\":-2209186800000,\"actype\":\"1\",\"airline\":\"1\",\"base\":\"1\",\"boardingGate\":\"1\",\"carousel\":\"1\",\"delayReason\":\"1\",\"demo\":\"1\",\"descript\":\"1\",\"estArriverDate\":-2209186800000,\"flightFlag\":\"1\",\"flightNo\":\"1\",\"flightType\":\"1\",\"flowStatus\":\"1\",\"linkFlag\":\"1\",\"modifyBy\":\"1\",\"modifyDate\":-2209186800000,\"operateDate\":-2209186800000,\"operator\":\"1\",\"pkid\":\"5\",\"plaArriveDate\":-2209186800000,\"preAirportActDep\":-2209186800000,\"preAirportEstDepDate\":-2209186800000,\"preAirportPlaDepDate\":-2209186800000,\"servStatus\":\"1\",\"startAirportName\":\"1\",\"startAirportThrCode\":\"1\",\"stopoverAirportName\":\"1\",\"stopoverAirportThrCode\":\"1\",\"synDate\":-2209186800000},{\"acno\":\"1\",\"actArriveDate\":-2209186800000,\"actype\":\"1\",\"airline\":\"1\",\"base\":\"1\",\"boardingGate\":\"1\",\"carousel\":\"1\",\"delayReason\":\"1\",\"demo\":\"1\",\"descript\":\"1\",\"estArriverDate\":-2209186800000,\"flightFlag\":\"1\",\"flightNo\":\"1\",\"flightType\":\"1\",\"flowStatus\":\"1\",\"linkFlag\":\"1\",\"modifyBy\":\"1\",\"modifyDate\":-2209186800000,\"operateDate\":-2209186800000,\"operator\":\"1\",\"pkid\":\"4\",\"plaArriveDate\":-2209186800000,\"preAirportActDep\":-2209186800000,\"preAirportEstDepDate\":-2209186800000,\"preAirportPlaDepDate\":-2209186800000,\"servStatus\":\"1\",\"startAirportName\":\"1\",\"startAirportThrCode\":\"1\",\"stopoverAirportName\":\"1\",\"stopoverAirportThrCode\":\"1\",\"synDate\":-2209186800000},{\"acno\":\"1\",\"actArriveDate\":-2209186800000,\"actype\":\"1\",\"airline\":\"1\",\"base\":\"1\",\"boardingGate\":\"1\",\"carousel\":\"1\",\"delayReason\":\"1\",\"demo\":\"1\",\"descript\":\"1\",\"estArriverDate\":-2209186800000,\"flightFlag\":\"1\",\"flightNo\":\"1\",\"flightType\":\"1\",\"flowStatus\":\"1\",\"linkFlag\":\"1\",\"modifyBy\":\"1\",\"modifyDate\":1503483178000,\"operateDate\":-2209186800000,\"operator\":\"1\",\"pkid\":\"3\",\"plaArriveDate\":1503571014000,\"preAirportActDep\":-2209186800000,\"preAirportEstDepDate\":-2209186800000,\"preAirportPlaDepDate\":-2209186800000,\"servStatus\":\"YC\",\"startAirportName\":\"1\",\"startAirportThrCode\":\"1\",\"stopoverAirportName\":\"1\",\"stopoverAirportThrCode\":\"1\",\"synDate\":-2209186800000},{\"acno\":\"B-2829\",\"actArriveDate\":1502966222000,\"actype\":\"B737-800\",\"airline\":\"1231\",\"base\":\"zppp\",\"boardingGate\":\"44444444444444\",\"carousel\":\"123123\",\"delayReason\":\"12312\",\"demo\":\"123123\",\"descript\":\"1231\",\"estArriverDate\":1503052619000,\"flightFlag\":\"123\",\"flightNo\":\"22222222222222\",\"flightType\":\"VIP\",\"linkFlag\":\"D\",\"modifyBy\":\"1\",\"modifyDate\":1503390405000,\"operateDate\":1502879704000,\"operator\":\"1\",\"pkid\":\"52\",\"plaArriveDate\":1503936000000,\"preAirportActDep\":1503052634000,\"preAirportEstDepDate\":1503052632000,\"preAirportPlaDepDate\":1503052629000,\"servStatus\":\"YW\",\"startAirportThrCode\":\"123123\",\"stopoverAirportThrCode\":\"12312\"},{\"acno\":\"B-2000\",\"base\":\"zppp\",\"estArriverDate\":1502940802000,\"flightNo\":\"TV9800\",\"operateDate\":1502940689000,\"operator\":\"1\",\"pkid\":\"71\",\"plaArriveDate\":1504022400000,\"servStatus\":\"ZC\"},{\"acno\":\"6238\",\"actArriveDate\":1501387200000,\"actype\":\"B737\",\"base\":\"ZPPP\",\"boardingGate\":\"T3号楼\",\"carousel\":\"B1\",\"estArriverDate\":1501387200000,\"flightFlag\":\"CA\",\"flightNo\":\"CA2018\",\"flightType\":\"ZJ\",\"flowStatus\":\"1\",\"linkFlag\":\"Y\",\"modifyBy\":\"1\",\"modifyDate\":1501747860000,\"operateDate\":1501744110000,\"operator\":\"系统管理员\",\"pkid\":\"1\",\"plaArriveDate\":1503372799000,\"preAirportActDep\":1501380000000,\"preAirportEstDepDate\":1501380000000,\"preAirportPlaDepDate\":1501380000000,\"servStatus\":\"ZC\",\"startAirportName\":\"1\",\"startAirportThrCode\":\"CAN\",\"stopoverAirportName\":\"1\",\"stopoverAirportThrCode\":\"PEK\",\"synDate\":1501744110000}],\"msg\":\"ERRMSG.COMMON.SUCCESS_CODE\",\"msgData\":[],\"page\":1,\"total\":0}";


    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.plan_list_main);
        ListView listView = (ListView) this.findViewById(R.id.listView);
        String s = GetPostUtils.sendPost("http://192.168.1.113:8080/api/v1/flightPlanList", null);
        System.out.println(msData);//假的数据


        Result b = (Result) JSONObject.parseObject(msData, Result.class);
        List<LmPmFlightPlan> lmPmFlightPlen = JSON.parseArray(b.getData().toString(), LmPmFlightPlan.class);
        List<HashMap<String, Object>> data = new ArrayList<HashMap<String, Object>>();

        for (LmPmFlightPlan lmPmFlightPlan : lmPmFlightPlen) {
            HashMap<String, Object> item = new HashMap<String, Object>();
            item.put("flightNo", lmPmFlightPlan.getFlightNo());
            item.put("acno", lmPmFlightPlan.getAcno());
            item.put("flightDate", lmPmFlightPlan.getPlaArriveDate());
            data.add(item);
        }
            //创建SimpleAdapter适配器将数据绑定到item显示控件上
            SimpleAdapter adapter = new SimpleAdapter(this, data, R.layout.plan_list_item,
                    new String[]{"flightNo", "acno", "flightDate"}, new int[]{R.id.flightNo, R.id.acno, R.id.flightDate});
          //实现列表的显示
          listView.setAdapter(adapter);

//            //获取到集合数据
//            List<Person> persons = service.getScrollData(0, 10);
//            List<HashMap<String, Object>> data = new ArrayList<HashMap<String,Object>>();
//            for(Person person : persons){
//                HashMap<String, Object> item = new HashMap<String, Object>();
//                item.put("id", person.getId());
//                item.put("name", person.getName());
//                item.put("phone", person.getPhone());
//                item.put("amount", person.getAmount());
//                data.add(item);
//            }
//            //创建SimpleAdapter适配器将数据绑定到item显示控件上
//            SimpleAdapter adapter = new SimpleAdapter(this, data, R.layout.item,
//                    new String[]{"name", "phone", "amount"}, new int[]{R.id.name, R.id.phone, R.id.amount});
//            //实现列表的显示
//            listView.setAdapter(adapter);
//            //条目点击事件
//            listView.setOnItemClickListener(new ItemClickListener());
//        }
//        //获取点击事件
//        private final class ItemClickListener implements AdapterView.OnItemClickListener {
//            @Override
//            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
//                ListView listView = (ListView) parent;
//                HashMap<String, Object> data = (HashMap<String, Object>) listView.getItemAtPosition(position);
//                String personid = data.get("id").toString();
//                Toast.makeText(getApplicationContext(), personid, 1).show();
//            }


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

    }

    @Override
    public void onPointerCaptureChanged(boolean hasCapture) {

    }
}


