package com.jnec.techfest.swayambhu;

import android.content.Intent;
import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.AdapterView;
import android.widget.TextSwitcher;
import android.widget.TextView;
import android.widget.ViewSwitcher;

import java.util.ArrayList;
import java.util.List;

import it.moondroid.coverflow.components.ui.containers.FeatureCoverFlow;

public class General_Event_Main extends AppCompatActivity {

    private FeatureCoverFlow coverFlow_General;

    private General_Event_Adapter GENERALEVENTADAPTER;

    private List<General_Event_1> GeneralEvent1List = new ArrayList<>();
    private TextSwitcher mTitle_General;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_general__event__main);


        initData();



        mTitle_General = (TextSwitcher)findViewById(R.id.title_General);
        mTitle_General.setFactory(new ViewSwitcher.ViewFactory() {
            @Override
            public View makeView() {
                LayoutInflater inflater = LayoutInflater.from(General_Event_Main.this);
                TextView txt = (TextView) inflater.inflate((R.layout.layout_title),null);
                txt.setTextColor(Color.BLACK);
                txt.setTextSize(30);

                return txt;

            }
        });

        Animation in = AnimationUtils.loadAnimation(this,R.anim.slide_in_top);
        Animation out = AnimationUtils.loadAnimation(this,R.anim.slide_out_bottom);

        mTitle_General.setAnimation(in);
        mTitle_General.setAnimation(out);






        GENERALEVENTADAPTER= new General_Event_Adapter(GeneralEvent1List,this);
        coverFlow_General = (FeatureCoverFlow) findViewById(R.id.coverflow_General);
        coverFlow_General.setAdapter(GENERALEVENTADAPTER);

        coverFlow_General.setOnScrollPositionListener(new FeatureCoverFlow.OnScrollPositionListener() {
            @Override
            public void onScrolledToPosition(int position) {
                mTitle_General.setText(GeneralEvent1List.get(position).getName());


            }

            @Override
            public void onScrolling() {

            }
        });


        coverFlow_General.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                if (position == 0)
                {
                    Intent in = new Intent(getApplicationContext(),Democracy.class);
                    startActivity(in);

                }
                if(position == 1)
                {
                    Intent in = new Intent(getApplicationContext(),The_One.class);
                    startActivity(in);
                }

                if(position == 2)
                {
                    Intent in = new Intent(getApplicationContext(),Master_vs_Slave_robot.class);
                    startActivity(in);
                }
                if(position == 3)
                {
                    Intent in = new Intent(getApplicationContext(),Project_Competition.class);
                    startActivity(in);
                }
                if(position == 4)
                {
                    Intent in = new Intent(getApplicationContext(),Introduction_to_robotics.class);
                    startActivity(in);
                }
                if(position == 5)
                {
                    Intent in = new Intent(getApplicationContext(),Abhivyakti_IT.class);
                    startActivity(in);
                }
                if(position == 6)
                {
                    Intent in = new Intent(getApplicationContext(),The_Quiz.class);
                    startActivity(in);
                }
                if(position == 7)
                {
                    Intent in = new Intent(getApplicationContext(),Paper_Presentation.class);
                    startActivity(in);
                }
                if(position == 8)
                {
                    Intent in = new Intent(getApplicationContext(),Suggestion_box.class);
                    startActivity(in);
                }

            }
        });




    }

    private void initData()
    {
        GeneralEvent1List.add(new General_Event_1("Democracy","http://www.miastogier.pl/baza/Encyklopedia/gry/Democracy3_PC/Okladka/okl_democracy3cover.jpg"));
        GeneralEvent1List.add(new General_Event_1("The One","http://www.salfordcommunityleisure.co.uk/sites/default/files/styles/page_width_standard/public/uploads/events/Model%20making%20edited%20for%20web.jpg?itok=NoYY2rBb"));
        GeneralEvent1List.add(new General_Event_1("Master Robot vs Slave Robot","http://thamesandkosmos.com/images/stories/virtuemart/product/620377_roboticsworkshop_model8.jpg"));
        GeneralEvent1List.add(new General_Event_1("Project Competition","https://newsignature.com/wp-content/uploads/2017/02/project-management-1024x512.png"));
        GeneralEvent1List.add(new General_Event_1("Introduction To Robotics","https://image.freepik.com/free-photo/robot-doing-the-peace-sign_1048-3527.jpg"));
        GeneralEvent1List.add(new General_Event_1("Abhivyakti","https://image.freepik.com/free-photo/people_1122-1876.jpg"));
        GeneralEvent1List.add(new General_Event_1("The Quiz","https://image.freepik.com/free-vector/quiz-background-with-items-in-flat-design_23-2147599082.jpg"));
        GeneralEvent1List.add(new General_Event_1("Paper Presentation","http://millenniumupdate.in/img/competiton/paper.jpg"));
        GeneralEvent1List.add(new General_Event_1("Suggesstion Box Designing and Model Making","https://associationsnow.com/wp-content/uploads/2016/02/0201_suggestion-800x480.jpg"));

    }
}
