package com.example.avinashke1.card123;

import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import java.util.ArrayList;

/**
 * Created by avinash on 22/3/16.
 */
public class ProductList extends ActionBarActivity {

    private RecyclerView recyclerView;
    private RecyclerView.LayoutManager layoutManager;
    private RecyclerView.Adapter adapter;
    ArrayList<Product> arrayList;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.productlist);
        recyclerView = (RecyclerView)findViewById(R.id.recycler_view);
        recyclerView.setHasFixedSize(true);
        layoutManager = new LinearLayoutManager(this);
        recyclerView.setLayoutManager(layoutManager);
        arrayList = new ArrayList<>();

        Product stationary= new Product();
        //Adding data to the superhero object
        stationary.setImgUrl("http://172.16.41.13/frizin/01.jpg");
        stationary.setName("Avinash");
        stationary.setAge(29);

        arrayList.add(stationary);
        Product stationary1= new Product();
        //Adding data to the superhero object
        stationary1.setImgUrl("http://www.newhealthadvisor.com/images/1HT02932/ice%20cream.jpg");
        stationary1.setName("Anurag");
        stationary1.setAge(27);

        arrayList.add(stationary1);

        Product stationary2= new Product();
        //Adding data to the superhero object
        stationary2.setImgUrl("http://172.16.41.13/frizin/01.jpg");
        stationary2.setName("Sudhanshu");
        stationary2.setAge(24);

        arrayList.add(stationary2);

        Product stationary3= new Product();
        //Adding data to the superhero object
        stationary3.setImgUrl("http://172.16.41.13/frizin/01.jpg");
        stationary3.setName("Arpit");
        stationary3.setAge(23);

        arrayList.add(stationary3);

        adapter=new ProductAdapter(arrayList,this);

        recyclerView.setAdapter(adapter);
        recyclerView.setItemAnimator(null);


    }
}

