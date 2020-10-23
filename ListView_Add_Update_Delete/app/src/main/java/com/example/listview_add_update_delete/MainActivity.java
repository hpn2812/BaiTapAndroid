package com.example.listview_add_update_delete;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.Button;
import android.widget.CursorAdapter;
import android.widget.EditText;
import android.widget.ListView;
import android.widget.Switch;
import android.widget.Toast;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    ListView listViewSinhVien;
    EditText editTextTen;
    EditText editTextTuoi;
    Button buttonThem;
    Button buttonSua;
    Button buttonXoa;
    ArrayList<SinhVien> arrayListSinhVien;
    SinhVienAdapter myCustomAdapter;
    static int vitri=-1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        anhXa();
        arrayListSinhVien= new ArrayList<SinhVien>();
        arrayListSinhVien.add(new SinhVien(R.drawable.ic_android_black_24dp,"Huỳnh Phong Nhã",20));
        arrayListSinhVien.add(new SinhVien(R.drawable.ic_android_black_24dp,"Nguyễn Thanh Duy",20));
        arrayListSinhVien.add(new SinhVien(R.drawable.ic_android_black_24dp,"Phạm Duy Thanh",20));
        myCustomAdapter=new SinhVienAdapter(this,R.layout.activity_dong__sinh__vien,arrayListSinhVien);
        listViewSinhVien.setAdapter(myCustomAdapter);
        listViewSinhVien.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int position, long l) {
                vitri=position;
                editTextTen.setText(arrayListSinhVien.get(position).getName());
                editTextTuoi.setText(arrayListSinhVien.get(position).getAge()+"");
            }
        });
    }
    private void anhXa(){
        listViewSinhVien=findViewById(R.id.lvSinhVien);
        editTextTen=findViewById(R.id.edName);
        editTextTuoi=findViewById(R.id.edAge);
        buttonThem=findViewById(R.id.btnAdd);
        buttonSua=findViewById(R.id.btnUpdate);
        buttonXoa=findViewById(R.id.btnDelete);
        //Click
        buttonThem.setOnClickListener( this);
        buttonSua.setOnClickListener(this);
        buttonXoa.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        switch (view.getId()){
            case R.id.btnAdd:
              
                String ten=editTextTen.getText().toString();
                 int age= Integer.parseInt(editTextTuoi.getText().toString());

                SinhVien tmp=new SinhVien(R.drawable.ic_android_black_24dp,ten,age);
                arrayListSinhVien.add(tmp);
                myCustomAdapter.notifyDataSetChanged();
                break;
            case R.id.btnUpdate:
                if ( vitri==-1){
                    Toast.makeText(this,"Chưa chọn Item",Toast.LENGTH_LONG).show();
                }
                else if (vitri>=0)
                {
                    String tenDaSua=editTextTen.getText().toString();
                    int tuoiDaSua= Integer.parseInt(editTextTuoi.getText().toString());
                    SinhVien sv=new SinhVien(R.drawable.ic_android_black_24dp,tenDaSua,tuoiDaSua);
                    arrayListSinhVien.set(vitri,sv);
                    myCustomAdapter.notifyDataSetChanged();
                }

                break;
            case R.id.btnDelete:
                arrayListSinhVien.remove(vitri);
                myCustomAdapter.notifyDataSetChanged();
                break;
        }


    }
}