package com.example.sit708_task5_1property;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import java.util.List;

public class MainActivity extends AppCompatActivity {
    RecyclerView recyclerView;
    LinearLayoutManager layoutManager;
    PropertyAdapter propertyAdapter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        recyclerView = findViewById(R.id.recyclerView);
        layoutManager = new LinearLayoutManager(this, LinearLayoutManager.VERTICAL, false);
        propertyAdapter = new PropertyAdapter(Property.propertyList());
        recyclerView.setLayoutManager(layoutManager);
        recyclerView.setAdapter(propertyAdapter);
    }

    public class PropertyAdapter extends RecyclerView.Adapter<PropertyAdapter.viewHolder> {
        private List<Property> propertyList;
        public PropertyAdapter(List<Property> propertyList) {
            this.propertyList = propertyList;
        }
        public class viewHolder extends RecyclerView.ViewHolder {

            TextView locationTextView,rentTextView,bedroomTextView,carParkTextView,bathroomTextView;
            ImageView imageView;

            public viewHolder(View view) {
                super(view);
                imageView = (ImageView) view.findViewById(R.id.imageView);
                locationTextView = (TextView) view.findViewById(R.id.locationTextView);
                rentTextView = (TextView) view.findViewById(R.id.rentTextView);
                bedroomTextView = (TextView) view.findViewById(R.id.bedroomTextView);
                carParkTextView = (TextView) view.findViewById(R.id.carParkTextView);
                bathroomTextView = (TextView) view.findViewById(R.id.bathroomTextView);
            }
        }

        @Override
        public viewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
            View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.property_item, parent, false);
            return new viewHolder(view);
        }

        @Override
        public void onBindViewHolder(viewHolder holder, int index) {
            holder.imageView.setImageResource(R.drawable.image1);
            holder.locationTextView.setText(propertyList.get(index).getLocation());
            holder.rentTextView.setText(propertyList.get(index).getRent()+" PW");
            holder.bedroomTextView.setText(propertyList.get(index).getBedroomCount()+" Bedroom");
            holder.carParkTextView.setText(propertyList.get(index).getCarParkCount()+" Car park");
            holder.bathroomTextView.setText(propertyList.get(index).getBathroomCount()+ " Bathroom");
        }

        @Override
        public int getItemCount() {
            return propertyList.size();
        }
    }

}