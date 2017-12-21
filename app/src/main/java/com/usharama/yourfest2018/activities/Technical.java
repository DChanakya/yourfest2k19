package com.usharama.yourfest2018.activities;

import android.content.Intent;
import android.support.design.widget.TabLayout;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;
import android.support.v4.view.ViewPager;
import android.os.Bundle;
import android.text.Html;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;

import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import com.usharama.yourfest2018.R;
import com.usharama.yourfest2018.models.Event;

import java.util.ArrayList;

public class Technical extends AppCompatActivity {
    public static ArrayList<Event> events;
    /**
     * The {@link android.support.v4.view.PagerAdapter} that will provide
     * fragments for each of the sections. We use a
     * {@link FragmentPagerAdapter} derivative, which will keep every
     * loaded fragment in memory. If this becomes too memory intensive, it
     * may be best to switch to a
     * {@link android.support.v4.app.FragmentStatePagerAdapter}.
     */
    private SectionsPagerAdapter mSectionsPagerAdapter;

    /**
     * The {@link ViewPager} that will host the section contents.
     */
    private ViewPager mViewPager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        events = new ArrayList<>();
        {
            events.add(new Event(
                    "Paper Presentation",
                    " <b> Rules:</b><br>\n" +
                            "                                        Paper should be in IEEE format, max two authors per team.\n" +
                            "                                        <br>\n" +
                            "                                        Last Date for submission of your paper in soft copy is 21-Jan-2017.\n" +
                            "                                        Selection of the paper will be notified on 23-Jan-2017.\n" +
                            "                                        <div class=\"panel-group\" id=\"accordion\">\n" +
                            "                                            <div class=\"panel panel-default\">\n" +
                            "                                                <div class=\"panel-heading\">\n" +
                            "                                                    <h4 class=\"panel-title\">\n" +
                            "                                                        <a data-toggle=\"collapse\" data-parent=\"#accordion\" href=\"#acse\">CSE/IT</a>\n" +
                            "                                                    </h4>\n" +
                            "                                                </div>\n" +
                            "                                                <div id=\"acse\" class=\"panel-collapse collapse in\">\n" +
                            "                                                    <div class=\"panel-body\">\n" +
                            "                                                        <p>Cloud Computing</p>\n" +
                            "                                                        <p>Cyber Security</p>\n" +
                            "                                                        <p>Internet Of Things (IoT)</p>\n" +
                            "                                                        <p>Machine Learning</p>\n" +
                            "                                                        <p>Artificial Intelligence</p>\n" +
                            "                                                        <p>Robotics</p>\n" +
                            "                                                        <p>Distributed Computing</p>\n" +
                            "                                                        <p>Cognitive Computing</p>\n" +
                            "                                                        <p>Cluster Computing</p>\n" +
                            "                                                        <p>\n" +
                            "                                                            <strong>Send to : <a href=\"mailto:yourfest.cse@usharama.in\">yourfest.cse@usharama.in </a></strong></p>\n" +
                            "                                                        <p>\n" +
                            "                                                            &nbsp;</p>    \n" +
                            "                                                    </div>\n" +
                            "                                                </div>\n" +
                            "                                            </div>\n" +
                            "                                            <div class=\"panel panel-default\">\n" +
                            "                                                <div class=\"panel-heading\">\n" +
                            "                                                    <h4 class=\"panel-title\">\n" +
                            "                                                        <a data-toggle=\"collapse\" data-parent=\"#accordion\" href=\"#aece\">ECE</a>\n" +
                            "                                                    </h4>\n" +
                            "                                                </div>\n" +
                            "                                                <div id=\"aece\" class=\"panel-collapse collapse  \">\n" +
                            "                                                    <div class=\"panel-body\">\n" +
                            "                                                        <p> Wireless Communication</p>\n" +
                            "                                                        <p> Mobile Networking</p>\n" +
                            "                                                        <p> Image Processing</p>\n" +
                            "                                                        <p> Embedded Systems</p>\n" +
                            "                                                        <p> Vlsi Technology</p>\n" +
                            "                                                        <p> Nano Technology</p>\n" +
                            "                                                        <p>\n" +
                            "                                                            <strong>Send to : <a href=\"mailto:yourfest.ece@usharama.in\">yourfest.ece@usharama.in</a></strong></p>\n" +
                            "\n" +
                            "                                                    </div>\n" +
                            "                                                </div>\n" +
                            "                                            </div>\n" +
                            "                                            <div class=\"panel panel-default\">\n" +
                            "                                                <div class=\"panel-heading\">\n" +
                            "                                                    <h4 class=\"panel-title\">\n" +
                            "                                                        <a data-toggle=\"collapse\" data-parent=\"#accordion\" href=\"#aeee\">EEE</a>\n" +
                            "                                                    </h4>\n" +
                            "                                                </div>\n" +
                            "                                                <div id=\"aeee\" class=\"panel-collapse collapse\">\n" +
                            "                                                    <div class=\"panel-body\">\n" +
                            "                                                        <p>Renewable energy sources</p>\n" +
                            "                                                        <p>Recent trends in power systems</p>\n" +
                            "                                                        <p>Artificial intelligence techniques</p>\n" +
                            "                                                        <p>Hybrid electric vehicles</p>\n" +
                            "                                                        <p>PLC and SCADA</p>\n" +
                            "                                                        <p>Smart and micro grids</p>\n" +
                            "                                                        <p>Transmission and distribution systems and protection</p>\n" +
                            "                                                        <p>Wireless electricity</p>\n" +
                            "                                                        <p>Any other topic related to Electrical engineering</p>\n" +
                            "                                                        <strong>Send to : <a href=\"mailto:yourfest.eee@usharama.in\">yourfest.eee@usharama.in&nbsp;</a></strong></p>\n" +
                            "\n" +
                            "                                                    </div>\n" +
                            "                                                </div>\n" +
                            "                                            </div>\n" +
                            "                                            <div class=\"panel panel-default\">\n" +
                            "                                                <div class=\"panel-heading\">\n" +
                            "                                                    <h4 class=\"panel-title\">\n" +
                            "                                                        <a data-toggle=\"collapse\" data-parent=\"#accordion\" href=\"#acivil\">CIVIL</a>\n" +
                            "                                                    </h4>\n" +
                            "                                                </div>\n" +
                            "                                                <div id=\"acivil\" class=\"panel-collapse collapse\">\n" +
                            "                                                    <div class=\"panel-body\">\n" +
                            "                                                        <p>Advances in construction technology</p>\n" +
                            "                                                        <p>Innovative pavement materials</p>\n" +
                            "                                                        <p>Advances in concrete technology</p>\n" +
                            "                                                        <p>RS&amp;HIS applications in civil engineering</p>\n" +
                            "                                                        <p>Nano technology applications in civil engineering</p>\n" +
                            "                                                        <p>Urban traffic control systems</p>\n" +
                            "                                                        <p>Low cost housing and infrastructure</p>\n" +
                            "                                                        <p>Any other topic in civil engineering</p>\n" +
                            "                                                        <p>\n" +
                            "                                                            <strong>Send to : <a href=\"mailto:yourfest.civil@usharama.in\">yourfest.civil@usharama.in&nbsp;</a></strong></p>\n" +
                            "                                                    </div>\n" +
                            "                                                </div>\n" +
                            "                                            </div>\n" +
                            "                                            <div class=\"panel panel-default\">\n" +
                            "                                                <div class=\"panel-heading\">\n" +
                            "                                                    <h4 class=\"panel-title\">\n" +
                            "                                                        <a data-toggle=\"collapse\" data-parent=\"#accordion\" href=\"#amechanical\">MECHANICAL</a>\n" +
                            "                                                    </h4>\n" +
                            "                                                </div>\n" +
                            "                                                <div id=\"amechanical\" class=\"panel-collapse collapse\">\n" +
                            "                                                    <div class=\"panel-body\">\n" +
                            "                                                        <p>Advanced manufacturing and materials</p>\n" +
                            "                                                        <p>Design and optimization</p>\n" +
                            "                                                        <p>Robotics and automation</p>\n" +
                            "                                                        <p>Turbo machinery</p>\n" +
                            "                                                        <p>Recent trends in thermal sciences</p>\n" +
                            "                                                        <p>\n" +
                            "                                                            <strong>Send to : <a href=\"mailto:yourfest.mech@usharama.in\">yourfest.mech@usharama.in </a></strong></p>\n" +
                            "                                                        <p>\n" +
                            "                                                            &nbsp;</p>\n" +
                            "\n" +
                            "\n" +
                            "                                                    </div>\n" +
                            "                                                </div>\n" +
                            "                                            </div>\n" +
                            "                                        </div> \n" +
                            "<div id=\"diptopics\" style=\"display:none;\">"+
                            "										"+
                            "										"+
                            "										<div class=\"panel panel-default\">"+
                            "                                                <div class=\"panel-heading\">"+
                            "                                                    <h4 class=\"panel-title\">"+
                            "                                                        <a data-toggle=\"collapse\" data-parent=\"#accordion\" href=\"#acse\">DCE</a>"+
                            "                                                    </h4>"+
                            "                                                </div>"+
                            "                                                <div id=\"acse\" class=\"panel-collapse collapse in\">"+
                            "                                                    <div class=\"panel-body\">"+
                            "                                                        	<p>"+
                            "			"+
                            "		<p>"+
                            "			1)      Low cost construction techniques</p>"+
                            "		<p>"+
                            "			2)      Earthquake Resistant elements</p>"+
                            "		<p>"+
                            "			3)      GPS & it’s applications</p>"+
                            "		<p>"+
                            "			4)      Green buildings</p>"+
                            "		<p>"+
                            "			5)      Geo-synthetics in construction of roads</p>"+
                            "	"+
                            "                                                        <p>"+
                            "                                                            <strong>Send to : <a href=\"mailto:yourfest.diploma@usharama.in\">yourfest.diploma@usharama.in </a></strong></p>"+
                            "                                                        <p>"+
                            "                                                             </p>    "+
                            "                                                    </div>"+
                            "                                                </div>"+
                            "                                            </div>"+
                            "										"+
                            "										"+
                            "										"+
                            "										"+
                            "										 <div class=\"panel panel-default\">"+
                            "                                                <div class=\"panel-heading\">"+
                            "                                                    <h4 class=\"panel-title\">"+
                            "                                                        <a data-toggle=\"collapse\" data-parent=\"#accordion\" href=\"#amechanical\">DECE</a>"+
                            "                                                    </h4>"+
                            "                                                </div>"+
                            "                                                <div id=\"amechanical\" class=\"panel-collapse collapse in\">"+
                            "                                                    <div class=\"panel-body\">"+
                            "                                                        <p>"+
                            "			1)      Digital<strong>/</strong> Analog communication</p>"+
                            "		<p>"+
                            "			2)      Micro processor</p>"+
                            "		<p>"+
                            "			3)      Micro controllers</p>"+
                            "		<p>"+
                            "			4)      VLSI</p>"+
                            "		<p>"+
                            "			5)      Embedded systems</p>"+
                            "	<p>"+
                            "                                                            <strong>Send to : <a href=\"mailto:yourfest.diploma@usharama.in\">yourfest.diploma@usharama.in </a></strong></p>"+
                            "                                                        <p>"+
                            "                                                             </p>"+
                            ""+
                            ""+
                            "                                                    </div>"+
                            "                                                </div>"+
                            "                                            </div>"+
                            "											"+
                            "											"+
                            "											 <div class=\"panel panel-default\">"+
                            "                                                <div class=\"panel-heading\">"+
                            "                                                    <h4 class=\"panel-title\">"+
                            "                                                        <a data-toggle=\"collapse\" data-parent=\"#accordion\" href=\"#amechanical\">DEEE</a>"+
                            "                                                    </h4>"+
                            "                                                </div>"+
                            "                                                <div id=\"amechanical\" class=\"panel-collapse collapse in\">"+
                            "                                                    <div class=\"panel-body\">"+
                            "                                                        <p style=\"margin-left:29.25pt;\">"+
                            "			1)      Power Electronics</p>"+
                            "		<p style=\"margin-left:29.25pt;\">"+
                            "			2)      Power systems</p>"+
                            "		<p style=\"margin-left:29.25pt;\">"+
                            "			3)      SCADA and it’s applications</p>"+
                            "		<p style=\"margin-left:29.25pt;\">"+
                            "			4)      PLC & it’s applications</p>"+
                            "		<p style=\"margin-left:29.25pt;\">"+
                            "			5)      Smart grid</p>"+
                            ""+
                            "                                                        <p>"+
                            "                                                            <strong>Send to : <a href=\"mailto:yourfest.diploma@usharama.in\">yourfest.diploma@usharama.in </a></strong></p>"+
                            "                                                        <p>"+
                            "                                                             </p>"+
                            ""+
                            ""+
                            "                                                    </div>"+
                            "                                                </div>"+
                            "                                            </div>"+
                            "											"+
                            "											"+
                            "											 <div class=\"panel panel-default\">"+
                            "                                                <div class=\"panel-heading\">"+
                            "                                                    <h4 class=\"panel-title\">"+
                            "                                                        <a data-toggle=\"collapse\" data-parent=\"#accordion\" href=\"#amechanical\">DME</a>"+
                            "                                                    </h4>"+
                            "                                                </div>"+
                            "                                                <div id=\"amechanical\" class=\"panel-collapse collapse in\">"+
                            "                                                    <div class=\"panel-body\">"+
                            "                                                       <p>"+
                            "			1)      Advanced manufacturing methods</p>"+
                            "		<p>"+
                            "			2)      Green energy solutions</p>"+
                            "		<p>"+
                            "			3)      Robotics</p>"+
                            "		<p>"+
                            "			4)      Latest trends in thermal engineering</p>"+
                            "		<p>"+
                            "			5)      Latest trends in  design field</p>"+
                            "	                                                 <p>"+
                            "                                                            <strong>Send to : <a href=\"mailto:yourfest.diploma@usharama.in\">yourfest.diploma@usharama.in </a></strong></p>"+
                            "                                                        <p>"+
                            "                                                             </p>"+
                            ""+
                            ""+
                            "                                                    </div>"+
                            "                                                </div>"+
                            "                                            </div>"+
                            "										"+
                            "										"+
                            "										"+
                            "										"+
                            "										"+
                            "										"+
                            "										"+
                            "										"+
                            "										"+
                            "										"+
                            "										"+
                            "										"+
                            "										</div>"+
                            "\n ",
                    R.drawable.paper_presentation
            ));
            events.add(new Event("Poster Presentation",
                    " <div class=\"modal-body\">\n" +
                            "                                        <b> Rules:</b><br>\n" +
                            "                                        Max two authors per poster, minimum size A3\n" +
                            "                                        <h4 class=\"text-center\"> Poster Presentation</h4>\n" +
                            "                                        <div class=\"panel-group\" id=\"baccordion\">\n" +
                            "                                            <div class=\"panel panel-default\">\n" +
                            "                                                <div class=\"panel-heading\">\n" +
                            "                                                    <h4 class=\"panel-title\">\n" +
                            "                                                        <a data-toggle=\"collapse\" data-parent=\"#baccordion\" href=\"#bacse\">CSE/IT</a>\n" +
                            "                                                    </h4>\n" +
                            "                                                </div>\n" +
                            "                                                <div id=\"bacse\" class=\"panel-collapse collapse in\">\n" +
                            "                                                    <div class=\"panel-body\">\n" +
                            "                                                        <p>Cloud Computing</p>\n" +
                            "                                                        <p>Big Data</p>\n" +
                            "                                                        <p>Internet Of Things (IoT)</p>\n" +
                            "                                                        <p>Social Networking and Security</p>\n" +
                            "                                                        <p>Artificial Intelligence</p>\n" +
                            "                                                        <p>Mobile Computing</p>\n" +
                            "                                                        <p>\n" +
                            "                                                            <strong>Send to : <a href=\"mailto:yourfest.cse@usharama.in\">yourfest.cse@usharama.in </a></strong></p>\n" +
                            "                                                        <p>\n" +
                            "                                                            &nbsp;</p>    \n" +
                            "\n" +
                            "                                                    </div>\n" +
                            "                                                </div>\n" +
                            "                                            </div>\n" +
                            "                                            <div class=\"panel panel-default\">\n" +
                            "                                                <div class=\"panel-heading\">\n" +
                            "                                                    <h4 class=\"panel-title\">\n" +
                            "                                                        <a data-toggle=\"collapse\" data-parent=\"#baccordion\" href=\"#baece\">ECE</a>\n" +
                            "                                                    </h4>\n" +
                            "                                                </div>\n" +
                            "                                                <div id=\"baece\" class=\"panel-collapse collapse  \">\n" +
                            "                                                    <div class=\"panel-body\">\n" +
                            "                                                        <p> Wireless Communications and Sensor Networks</p>\n" +
                            "                                                        <p> Digital Image Processing</p>\n" +
                            "                                                        <p> Digital Signal Processing</p>\n" +
                            "                                                        <p> Embedded Systems</p>\n" +
                            "                                                        <p> Vlsi Technology</p>\n" +
                            "                                                        <p> Nano Technology</p>\n" +
                            "                                                        <p>\n" +
                            "                                                            <strong>Send to : <a href=\"mailto:yourfest.ece@usharama.in\">yourfest.ece@usharama.in</a></strong></p>\n" +
                            "\n" +
                            "                                                    </div>\n" +
                            "                                                </div>\n" +
                            "                                            </div>\n" +
                            "                                            <div class=\"panel panel-default\">\n" +
                            "                                                <div class=\"panel-heading\">\n" +
                            "                                                    <h4 class=\"panel-title\">\n" +
                            "                                                        <a data-toggle=\"collapse\" data-parent=\"#baccordion\" href=\"#baeee\">EEE</a>\n" +
                            "                                                    </h4>\n" +
                            "                                                </div>\n" +
                            "                                                <div id=\"baeee\" class=\"panel-collapse collapse\">\n" +
                            "                                                    <div class=\"panel-body\">\n" +
                            "                                                        <p>Renewable energy sources</p>\n" +
                            "                                                        <p>Recent trends in power systems</p>\n" +
                            "                                                        <p>Artificial intelligence techniques</p>\n" +
                            "                                                        <p>Hybrid electric vehicles</p>\n" +
                            "                                                        <p>PLC and SCADA</p>\n" +
                            "                                                        <p>Smart and micro grids</p>\n" +
                            "                                                        <p>Transmission and distribution systems and protection</p>\n" +
                            "                                                        <p>Wireless electricity</p>\n" +
                            "                                                        <p>Any other topic related to Electrical engineering</p>\n" +
                            "                                                        <strong>Send to : <a href=\"mailto:yourfest.eee@usharama.in\">yourfest.eee@usharama.in&nbsp;</a></strong></p>\n" +
                            "\n" +
                            "\n" +
                            "                                                    </div>\n" +
                            "                                                </div>\n" +
                            "                                            </div>\n" +
                            "                                            <div class=\"panel panel-default\">\n" +
                            "                                                <div class=\"panel-heading\">\n" +
                            "                                                    <h4 class=\"panel-title\">\n" +
                            "                                                        <a data-toggle=\"collapse\" data-parent=\"#baccordion\" href=\"#bacivil\">CIVIL</a>\n" +
                            "                                                    </h4>\n" +
                            "                                                </div>\n" +
                            "                                                <div id=\"bacivil\" class=\"panel-collapse collapse\">\n" +
                            "                                                    <div class=\"panel-body\">\n" +
                            "                                                        <p>Advances in construction technology</p>\n" +
                            "                                                        <p>Innovative pavement materials</p>\n" +
                            "                                                        <p>Advances in concrete technology</p>\n" +
                            "                                                        <p>RS&amp;HIS applications in civil engineering</p>\n" +
                            "                                                        <p>Nano technology applications in civil engineering</p>\n" +
                            "                                                        <p>Urban traffic control systems</p>\n" +
                            "                                                        <p>Low cost housing and infrastructure</p>\n" +
                            "                                                        <p>Any other topic in civil engineering</p>\n" +
                            "                                                        <p>\n" +
                            "                                                            <strong>Send to : <a href=\"mailto:yourfest.civil@usharama.in\">yourfest.civil@usharama.in&nbsp;</a></strong></p>\n" +
                            "                                                    </div>\n" +
                            "                                                </div>\n" +
                            "                                            </div>\n" +
                            "                                            <div class=\"panel panel-default\">\n" +
                            "                                                <div class=\"panel-heading\">\n" +
                            "                                                    <h4 class=\"panel-title\">\n" +
                            "                                                        <a data-toggle=\"collapse\" data-parent=\"#baccordion\" href=\"#bamechanical\">MECHANICAL</a>\n" +
                            "                                                    </h4>\n" +
                            "                                                </div>\n" +
                            "                                                <div id=\"bamechanical\" class=\"panel-collapse collapse\">\n" +
                            "                                                    <div class=\"panel-body\">\n" +
                            "                                                        <p>Advanced manufacturing and materials</p>\n" +
                            "                                                        <p>Design and optimization</p>\n" +
                            "                                                        <p>Robotics and automation</p>\n" +
                            "                                                        <p>Turbo machinery</p>\n" +
                            "                                                        <p>Recent trends in thermal sciences</p>\n" +
                            "                                                        <p>\n" +
                            "                                                            <strong>Send to : <a href=\"mailto:yourfest.mech@usharama.in\">yourfest.mech@usharama.in </a></strong></p>\n" +
                            "                                                        <p>\n" +
                            "                                                            &nbsp;</p>\n" +
                            "\n" +
                            "\n" +
                            "                                                    </div>\n" +
                            "                                                </div>\n" +
                            "                                            </div>\n" +
                            "                                        </div> \n" +
                            "                                    </div>\n" +
                            "                                   ",
                    R.drawable.poster_presentation));
            events.add(new Event("MODEL EXHIBITION",
                    " <h4 class=\"text-center\"> Model Exhibition (Diploma)</h4>\n" +
                            "                                        <b> Rules:</b><br>\n" +
                            "                                        Model Exhibition: Should be a team of two members.<br>\n" +
                            "                                        <b><span class=\"text-danger\">For Diploma(all branches) students only.</span></b>\n" +
                            "                                    <br><br>\n" +
                            "                                        <strong>Event Coordinators</strong>\n" +
                            "                                        <br>Faculty: G Ravi, Diploma, ph:8919854816\n" +
                            "                                        <br>Students: 1.K Hemanth, Diploma 16466-m-221 2.A Ram sai, Diploma, 16466-m-201\n ",
                    R.drawable.model_exhibition));
            events.add(new Event(" Project Exhibition",
                    "  <h4 class=\"text-center\"> Project Exhibition</h4>\n" +
                            "                                        <b> Rules:</b><br>\n" +
                            "                                        Project: Should be a team of two members<br>Every Department conducts the contest seperately and for more details contact respective department coordinator.\n" +
                            "                                    \n" +
                            "                                 ",
                    R.drawable.project_exhibition));
//            events.add(new Event("Robo Race",
//                    "<div class=\"modal-body\">\n" +
//                            "       <b class=\"text-danger\">Event Co-ordinator: Mr. D Murali Krishna, Mechanical,  Diploma Incharge,  Ph:7382608011  </b><br>\n" +
//                            "                                  <b> Rules:</b><br>\n" +
//                            "                                        Can be a team of three members\n" +
//                            "                                    </div>\n",
//                    R.drawable.robo_race));
            events.add(new Event(
                    "Engineer ka MahaSangram",
                            "                                        " +
                            " <p>" +
                            "\t\t\t<strong>For further details contact:Dr A.M.M.Rao Ph:9177412255,</strong><br> email: viceprincipal@usharama.in</p>\n" +
                            "\n" +
                            "                                       <p>\n" +
                            "&nbsp;<strong>Phase-1 (All students):&nbsp; </strong>Online exam-30 Minutes, 30 Multiple choice questions</p>\n" +
                            "\t\t<p>\n" +
                            "<strong>Phase-2 (30 Students): </strong>Answers should be in writing</p>\n" +
                            "\t\t<p>\n" +
                            "Round-1 :&nbsp; Basic knowledge in Engineering (10 questions scrolls on board)<br>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp; 10 Marks</p>\n" +
                            "\t\t<p>\n" +
                            "Round-2 : Logos (5 Each displayed for 10 seconds)<br>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp; 5 Marks</p>\n" +
                            "\t\t<p>\n" +
                            "Round-3 : Taglines (5 Each displayed for 10 seconds)<br>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp; 5 Marks</p>\n" +
                            "\t\t<p>\n" +
                            "Round-4 : Skill round (5-Questions, Each displayed for 60 seconds)<br>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp; 10 Marks</p>\n" +
                            "\t\t<p>\n" +
                            "Round-5:&nbsp; Observations on a page (Displayed for 5 minutes and then 10 oral questions)<br>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;  10 Marks</p>\n" +
                            "\t\t<p>\n" +
                            "<strong>Phase-3 (10 Students): </strong></p>\n" +
                            "\t\t<p>\n" +
                            "Round-1 : Group Discussion<br>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp; 10 Marks</p>\n" +
                            "\t\t<p>\n" +
                            "Round-2: Technical Round&nbsp;<br>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp; 10 Marks</p>\n" +
                            "\t\t<p>\n" +
                            "Round-3:&nbsp; HR Round<br>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp; 10 Marks</p>\n" +
                            "\t\t<p>\n" +
                            "<strong>Phase-4 (5 Students): </strong>50 i-respond questions. (This will be conducted on 6<sup>th</sup> Jan&rsquo;18)</p>\n" +
                            "\t\t<p>\n" +
                            "<strong>For each i-respond question:</strong><br />\n" +
                            "&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp; 1.&nbsp; Correct answer &amp; 1<sup>st</sup> response:&nbsp;&nbsp; 4 marks<br />\n" +
                            "&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp; 2.&nbsp; Correct answer &amp; 2<sup>nd</sup> response:&nbsp; 3 marks<br />\n" +
                            "&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp; 3.&nbsp; Correct answer &amp; 3<sup>rd</sup>&nbsp; response:&nbsp; 2 marks<br />\n" +
                            "&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp; 4.&nbsp; Correct answer &amp; 4<sup>th</sup> response:&nbsp;&nbsp; 1 marks<br />\n" +
                            "&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp; 5.&nbsp; Correct answer &amp; 5<sup>th</sup> response:&nbsp;&nbsp; 0 marks</p>\n" +
                            "\t\t<p>\n" +
                            "&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp; 6.&nbsp; No response&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp; &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp; :&nbsp;&nbsp; -1 marks<br />\n" +
                            "&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp; 7.&nbsp; &nbsp;Wrong answer&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp; &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp; :&nbsp;&nbsp; -2 marks<br />\n" +
                            "&nbsp;</p>\n" +
                            "\t\t<p>\n" +
                            "<strong>NOTE:</strong>&nbsp; Cumulative Scores are displayed after each i-respond question.<br />\n" +
                            " Time taken by individual respondent for each question will be showed on request.</p>" +
                            "\t\t<p>" +
                            "&nbsp;</p>" +
                            "\t\t<p>" +
                            "<strong>PRIZE: </strong>One Lakh Rupees (1<sup>st</sup> &nbsp;prize: Rs. 50,000,&nbsp; 2<sup>nd</sup>&nbsp; prize: Rs. 25,000, &nbsp;3<sup>rd</sup>&nbsp; prize: Rs. 15,000,\n" +
                            "\t\t\n" +
                            "&nbsp; 4<sup>th</sup> &amp; 5<sup>th</sup> each prize : Rs. 5,000, will be given on 6<sup>th</sup> Jan&rsquo;18 in prize distribution function.)\n" +
                            "\t\t\n" +
                            "&nbsp;</p>\n" +
                            "\t\t<p>\n" +
                            "<strong>Note: </strong>Multiple choice questions will be given in Phase-1 and Phase-4.&nbsp;" +
                            " These are from General Knowledge, Aptitude, Puzzles, Reasoning, English, Mathematics, Physics, Chemistry, Basics in Computers, Electrical, Electronics, Civil and Mechanics and are at Ist B.Tech. standard.</p>\n" +
                                    "\t\t<p>\n</p>" +
                                    "\t\t<p>\n</p>" +
                                    "\t\t<p>\n</p>" +
                                    "\t\t<p>\n</p>" +
                                    "\t\t\n\n\n\n\n  ",
                    R.drawable.engineer_ka_mahasangram));
            events.add(new Event(" Best Business Idea",
                    "     " +
                            "                                        <b class=\"text-danger\">Event Co-ordinator: Mr. V Mahesh John, T&P,  Ph:9396804756  </b><br>\n" +
                            "                                        <b> Rules:</b><br>\n" +
                            "                                        Should be presented at the time of event\n",
                    R.drawable.business_idea));
            events.add(new Event(" Bridge Construction",
                    "" +
                            "\n" +
                            "                                        <b class=\"text-danger\">Event Co-ordinator: Mr A.S.Nagaraju,Ph:9000323924  </b><br>\n" +
                            "\n" +
                            "                                        <b class=\"text-danger\">Event Co-ordinator: Mr B Vijaya Kumar, Civil,  Ph:8309127880  </b><br>\n" +
                            "\n" +
                            "                                        <b> Rules:</b><br>\n" +
                            "                                        Should be a team of two members.\n" +
                            "                                        <br>\n" +
                            "                                        <b> For Engineering and Diploma students.</b>\n" +
                            "                               \n\n",
                    R.drawable.bridge_construction));
            events.add(new Event("Technical Quiz",
                    "" +
                            "                                        <b> Rules:</b><br>\n" +
                            "\n" +
                            "                                        For <b><span class=\"text-primary\">Diploma</span>, <span  class=\"text-danger\">B.Tech</span> and <span class=\"text-success\"> M.Tech</span></b>\n" +
                            "\n" +
                            "                                        <br>\n" +
                            "                                        Should be a team of two members\n" +
                            "\t    <br>\n" +
                            "  Technical quiz is conducted separately by departments (Diploma and Engineering)\n" +
                            "                                    \n" +
                            "                                        <br> For more details contact respective department coordinators\n\n\n",
                    R.drawable.technical_quiz));
            events.add(new Event(" Electrospection",
                    "" +
                            "                                        <p>\n" +
                            "\t\t\t\t\t\t<b>Event Coordinator: Ms A Kanchana, ECE, Mobile:- 9490893179</b></p>\n" +
                            "\t\t<p>\n" +
                            "This event has four rounds.</p>\n" +
                            "\t\t<p>\n" +
                            "1. &nbsp;<strong>Written Test</strong>:</p>\n" +
                            "\t\t<p>\n" +
                            "&middot;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp; 1<sup>st</sup> Year physics, English.</p>\n" +
                            "\t\t<p>\n" +
                            "&middot;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp; 2<sup>nd</sup> &amp; 3<sup>rd</sup> Year stld, edc, mesh analysis.</p>\n" +
                            "\t\t<p>\n" +
                            "&middot;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp; 20 bits in 20 minutes</p>\n" +
                            "\t\t<p>\n" +
                            "2. <strong>Hidden Technical Components</strong>:</p>\n" +
                            "\t\t<p>\n" +
                            "&middot;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp; A picture will be shown for 15 sec in the time you have to identify the technical components.</p>\n" +
                            "\t\t<p>\n" +
                            "3. <strong>Circuit Designing</strong>:</p>\n" +
                            "\t\t<p>\n" +
                            "&middot;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp; You have to connect the circuit as per the giver diagram and show the output waveform.</p>\n" +
                            "\t\t<p>\n" +
                            "4. <strong>Quiz</strong>:</p>\n" +
                            "\t\t<p>\n" +
                            "&middot;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp; Current Affairs</p>\n" +
                            "\t\t<p>\n" +
                            "&nbsp;</p>\n" +
                            "\t\t<p>\n" +
                            "<strong>For ECE branch students only(Engineering and Diploma).</strong></p>\n" +
                            "\t\t<p>\n" +
                            "&nbsp;</p>\n" +
                            "\t\t<p>\n" +
                            "<strong>Rules</strong>:</p>\n" +
                            "\t\t<p>\n" +
                            "This event is completely based upon accuracy of circuits.</p>\n" +
                            "\t\t<p>\n" +
                            "This event should consist of one participant,</p>\n" +
                            "\t\t<p>\n" +
                            "In circuit designing you will be given circuit diagram with all required components you have to select the necessary components.</p>\n" +
                            "\t\t<p>\n" +
                            "After completing the circuit your circuit will be tested.</p>\n" +
                            "\t\t<p>\n" +
                            "Electrical gadgets are strictly not allowed.</p>\n" +
                            "\t\t<p>\n" +
                            "Remaining rules will be announced at time of event.</p>\n" +
                            "\t\t<p>" +
                            "&nbsp;</p>" +
                            "\t\t<p>" +
                            "<strong>Event Organizers:</strong></p>\n" +
                            "\t\t<p>" +
                            "<strong>S.N.V.Sandeep, Ch. Madhuri, Ch. Kavya</strong></p>\n" +
                            "\t\n" +
                            "\t\t<p>\n</p>" +
                            "\t\t<p>\n</p>" +
                            "\t\t<p>\n</p>" +
                            "\t\t<p>\n</p>" +
                            "\t\n\n\n\n\n\n\n" ,
                    R.drawable.electrospection));

            events.add(new Event("Code War",
                    "   <p>\n" +
                            "Event Co-ordinator: Mr T.Narasimhappadu, CSE , Ph:9492638410</p>\n" +
                            "\t\t<p>\n" +
                            "<strong>Round 1:</strong></p>\n" +
                            "\t\t<p>\n" +
                            "<strong>screening test:-</strong></p>\n" +
                            "\t\t<p>\n" +
                            "In this round, 20 bits will be given to each participant and the time limit is 20minutes.</p>\n" +
                            "\t\t<p>\n" +
                            "The questions consists of:</p>\n" +
                            "\t\t<p>\n" +
                            "Basics of C language</p>\n" +
                            "\t\t<p>\n" +
                            "Simple logic evaluation bits.</p>\n" +
                            "\t\t<p>\n" +
                            "</p>\n" +
                            "\t\t<p>\n" +
                            "<strong>Rules for round1:</strong></p>\n" +
                            "\t\t<p>\n" +
                            "Participants should complete the online exam within 20 minutes</p>\n" +
                            "\t\t<p>\n" +
                            "The qualified students will be promoted to the second round.</p>\n" +
                            "\t\t<p>\n" +
                            "</p>\n" +
                            "\t\t<p>\n" +
                            "<strong>Round 2: </strong></p>\n" +
                            "\t\t<p>\n" +
                            "<strong>Implementation of logic:- </strong></p>\n" +
                            "\t\t<p>\n" +
                            "In this round, a logic/problem statement will be given and the students need to generate their own code with accurate output.</p>\n" +
                            "\t\t<p>\n" +
                            "The students will be provided with a system and the expected output should be generated.</p>\n" +
                            "\t\t<p>\n" +
                            "</p>\n" +
                            "\t\t<p>\n" +
                            "<strong>Rules for round2:</strong></p>\n" +
                            "\t\t<p>\n" +
                            "Logic is common to all the participants.</p>\n" +
                            "\t\t<p>\n" +
                            "Time limit is 30 minutes</p>\n" +
                            "\t\t<p>\n" +
                            "The students selected in the second round will be promoted to the third round.</p>\n" +
                            "\t\t<p>\n" +
                            "</p>\n" +
                            "\t\t<p>\n" +
                            "<strong>Round 3:</strong></p>\n" +
                            "\t\t<p>\n" +
                            "<strong>Debugging:-</strong></p>\n" +
                            "\t\t<p>\n" +
                            "In this, the participant should detect the errors in the given program and display the desired output.</p>\n" +
                            "\t\t<p>\n" +

                            "<strong>Rules for round3:</strong></p>\n" +
                            "\t\t<p>\n" +
                            "In this round, the participants should detect the error within the given time.</p>\n" +
                            "\t\t<p>\n" +
                            "If more than one participants detect the error at the same time, their marks in the first two rounds will be considered.</p>\n" +
                            "\t\t<p>\n" +
                            "The time limit for the third round will be announced at the time of event.</p>\n" +
                            "\t\n" +
                            "\n" +
                            "\n" +
                            "\t\t<p>\n</p>" +
                            "\t\t<p>\n</p>" +
                            "\t\t<p>\n</p>" +
                            "\t\t<p>\n</p>" +
                            "\t\n\n\n\n\n\n\n   ",
                    R.drawable.c_programming));




            events.add(new Event("Circuitrix",
                    "<b class=\"text-danger\">Event Co-ordinator: Ms V.Praveena, ECE,  Ph:9985867813 </b><br>\n" +
                            "                                        <p>This event will be organized by the III year ECE students<br>\n" +
                            "                                            The event consist of 4 rounds.<br>\n" +
                            "                                            1. Written test[ Aptitute, EDC, Basic Physics, STLD, ET] -20 bits - 20 Mins<br>\n" +
                            "                                            2. Components Identification <br>\n" +
                            "                                            using color coding, IC numbers etc..<br>\n" +
                            "                                            PIN names. 20sec per head<br>\n" +
                            "                                            3. Circuit Designing:<br>\n" +
                            "                                            Connect the circuit as per the diagram and show the output\n" +
                            "                                            <br>\n" +
                            "                                            4. Quiz: Current affairs\n" +
                            "                                            <br>\n" +
                            "                                            Spot Registrations are accepted.<br>\n" +
                            "                                            The event will be conducted on 25/1/17\n" +
                            "                                            <br>\n" +
                            "                                            Timings: will be start around 10:00 AM\n" +
                            "                                            <br>Participation certificates will be given\n" +
                            "                                        </p>\n" +
                            "                                        <b> Rules:</b><br>\n" +
                            "                                        Will be announced on spot\n" +
                            "\t\t<p>\n</p>" +
                            "\t\t<p>\n</p>" +
                            "\t\t<p>\n</p>" +
                            "\t\t<p>\n</p>" +
                            "\t\n\n\n\n\n\n\n"
                            ,
                    R.drawable.circuitrix));



            events.add(new Event("Crypt yoUR Mind",
                    "<p>\n" +
                            "Staff Co-ordinator:&nbsp; &nbsp;MSS Nayak, CSE , Ph: 9177720194</p>\n" +
                            "<p>" +
                            "Student Co-ordinator: K.Bhanu,CSE,Ph:9502305784</p>\n" +

                            "<p>\n" +
                            " Rules:</strong></p>\n" +
                            "<p>" +
                            " &nbsp; &nbsp; Only registered candidates are eligible to participate</p>\n" +
                            "<p>\n" +
                            " &nbsp; &nbsp; All the questions must be answered with in the time limit.</p>\n" +
                            "<p>\n" +
                            " Round 1:</strong></p>\n" +
                            "<p>\n" +
                            "Number of questions will be 30 in this, out of which a minimum 20 questions must be answered correctly so as to get qualified for</p>\n" +
                            "<p>\n" +
                            "&ldquo;Round-2&rdquo;. Time limit:15min.</p>\n" +
                            "<p>\n" +
                            "&nbsp; Round 2:</strong></p>" +
                            "<p> Number of questions will be 60 and the time limit is 20min. Top Scorer will be the winner.</p>\n" +
                            "<p>\n" +
                            "<strong>Example</strong>:&rdquo;!!!siht sa ysae sa ton si noitpyrced&rdquo;.</p>\n" +
                            "<p>\n" +
                            "<strong>Note: </strong>Spot Registrations&nbsp; are available.</p>\n" +
                            "\t\n" +
                            "<p>\n</p>" +
                            "<p>\n</p>" +
                            "<p>\n</p>" +
                            "\t\t<p>\n</p>" +
                            "\t\n\n\n\n\n\n\n" ,
                    R.drawable.crypt));



            events.add(new Event("Google Master",
                    "<p>\n" +
                            "                                        &nbsp;<b>Staff Co-ordinator: &nbsp;Dr.SM Roychoudri, CSE , Ph: 9849645441</b></p>\n" +
                            "\t\t<p>" +
                            " Student Co-ordinator: Nag Saran,CSE,Ph:8074006214</p>\n" +
                            "\t\t<p>\n" +
                            "<strong>Rules:</strong></p>" +
                            "\t\t<p>" +
                            " Candidates should be registered with his/her own e-mail addresses.(The candidate must remember the mail id and its password).</p>\n" +
                            "\t\t<p>\n" +
                            " The event will be started at a time for all the candidates.</p>\n" +
                            "\t\t<p>\n" +
                            " The late comers will be ignored.</p>\n" +
                            "\t\t<p>\n" +
                            " The time limit for this event will be 30mins.</p>\n" +
                            "\t\t<p>\n" +
                            " Consists of 5 questions and all should be answered correctly .</p>\n" +
                            "\t\t<p>\n" +
                            " If the 1<sup>st</sup> question answer is correct, then only the next question will be displaced and vice-versa.</p>\n" +
                            "\t\t<p>\n" +
                            " Spot registrations will be closed at 11:00AM for this event only.</p>\n" +
                            "\n" +
                            "\t\t<p>\n</p>" +
                            "\t\t<p>\n</p>" +
                            "\t\t<p>\n</p>" +
                            "\t\t<p>\n</p>" +
                            "\t\n\n\n\n\n\n\n" ,
                    R.drawable.googlemaster));



            events.add(new Event("Water Rockets",
                    " <p align=\"center\">\n" +
                            "                                            <strong>Event Co-ordinator : Mr V Ajay Kumar; &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;Dept: Mech&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp; &nbsp;Ph:9490501085</strong></p>\n" +
                            "\t\t<p>\n" +
                            "\t\t\t1 Students should bring their water bottle and air pin arrangement to bottle cap.</p>\n" +
                            "\t\t<p>\n" +
                            "\t\t\t2 Winners are selected according to distance travelled by the bottle.</p>\n" +
                            "\t\t<p>\n" +
                            "\t\t\t3 Should not use any compressed gases and chemical solutions.</p>\n" +
                            "\t\t<p>\n" +
                            "\t\t\t4 Air pump is provided at the college.</p>\n" +
                            "\t\t<p>\n" +
                            "\t\t\t5 The event will be held within the college premises only.</p>\n" +
                            "\t\t<p>\n" +
                            "\t\t\t6. The decisions of organizing committee will be final and binding.</p>\n" +
                            "\t\t<p>\n" +
                            "\t\t\t7. The management shall not be held responsible for any kind of injury caused in the course of the event.</p>\n" +
                            "\t\t<p>\n" +
                            "\t\t\t8. Aggressive behavior or&nbsp;&nbsp; arguments will result in immediate disqualification.</p>\n" +
                            "\t\t<p>\n" +
                            "\t\t\t9. The Organizing committee reserves the right to change the venue, time and rules, if necessary&nbsp;</p>\n" +
                            "\t\n" +
                            "                   " +
                            "\t\t<p>\n</p>" +
                            "\t\t<p>\n</p>" +
                            "\t\t<p>\n</p>" +
                            "\t\t<p>\n</p>" +
                            "\t\n\n\n\n\n\n\n" ,
                    R.drawable.waterrockets));



            events.add(new Event("Clay Moulding",
                    "\t<p>\n" +
                            "                                            <strong>Event Coordinator: A.S.Nagaraju, Ph:9000323924</strong></p>\n" +
                            "\t\t<ul>\n" +
                            "" +
                            " Open theme but you cannot bring any prints or cell phone pic . or a 3-d model. <br>\n" +
                            "" +
                            " you can use some add-ons like -ribbon ,feathers, sticks etc.. . <br>\n" +
                            "" +
                            " No colours . you are not allowed to colour the model in anyway <br>\n" +
                            "" +
                            " Bring newspaper to clean you table . <br>\n" +
                            "" +
                            " you will be given a fixed amount of clay and u can&#39;t bring your own clay from your side. <br>\n" +
                            "" +
                            " Registration fee is 100. <br>\n" +
                            "\t\t</ul>\n" +
                            "\t\t<p>\n" +
                            "  Model must be a innovative </p>\n" +
                            "\t\t<p>\n" +
                            " Team shall consist of not more than 2 members. There can be multiple teams for the same college. </p>\n" +
                            "<ul>\n" +
                            "" +
                            " Tell me if any non comps are coming. <br>\n" +
                            "" +
                            "Results declared by the judges will be final <br>\n" +
                            "\t\t</ul>\n" +
                            "\t\t<p>\n</p>" +
                            "\t\t<p>\n</p>" +
                            "\t\t<p>\n</p>" +
                            "\t\t<p>\n</p>" +
                            "\t\n\n\n\n\n\n\n" ,
                    R.drawable.claymoulding));















            events.add(new Event("Auto CAD",
                    "" +
                            "                                        <b class=\"text-danger\">Event Co-ordinator: Mr B Anup, Civil, Ph:8143182364 </b><br>\n" +
                            "                                        <p> <b> Rules:</b><br>\n" +
                            "                                        <p>Time limit: 1 hour</p> \n" +
                            "                                        <p>Drawing:- Section, plan, elevation </p>\n" +
                            "                                        <p>For Engineering and Diploma students.</p>",
                    R.drawable.autocad));
            events.add(new Event(
                    " Mystery Busters  ",
                    "   <p>Event Coordinators: CH.Saranya,D.Prasanth\n" +
                            "                                        \n" +
                            "                                        <p>\n" +
                            "\t\t\tThe night is dark and full of terrors, so is the&nbsp; case. Solve the case, perform the tasks and find the Murderer.</p>\n" +
                            "\t\t<p>\n" +
                            "\t\t\t<span style=\"font-size:20px;\"><u><strong>Rules</strong></u></span></p>\n" +
                            "\t\t<p>\n" +
                            "\t\t\t1.&nbsp; Each team shall comprise of 4 participants only.</p>\n" +
                            "\t\t<p>\n" +
                            "\t\t\t2. Participants will have to solve cases with the help of clues and tasks</p>\n" +
                            "\t\t<p>\n" +
                            "\t\t\t3. No Team shall try to communicate with any other team or take any help form the volunteers.</p>\n" +
                            "\t\t<p>\n" +
                            "\t\t\t4. The event will be held within the college premises only.</p>\n" +
                            "\t\t<p>\n" +
                            "\t\t\t5. The decisions of Organizing committee will be final and binding.</p>\n" +
                            "\t\t<p>\n" +
                            "\t\t\t6. The management shall not be held responsible for any kind of injury caused in the course of the event.</p>\n" +
                            "\t\t<p>\n" +
                            "\t\t\t7. Use of expletives or aggressive behaviour will result i immediate disqualification.</p>\n" +
                            "\t\t<p>\n" +
                            "\t\t\t8. The participants are strictly advised not to disclose the name of their College/Institution to the Jury members/audience.</p>\n" +
                            "\t\t<p>\n" +
                            "\t\t\t9. The Organizing committee reserves the right to change the venue, time and rules, if desired&nbsp;</p>\n" +
                            "\t\t ",
                    R.drawable.mysterybuster
            ));


        }
        setContentView(R.layout.activity_technical);

        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        // Create the adapter that will return a fragment for each of the three
        // primary sections of the activity.
        mSectionsPagerAdapter = new SectionsPagerAdapter(getSupportFragmentManager());

        // Set up the ViewPager with the sections adapter.
        mViewPager = (ViewPager) findViewById(R.id.container);
        mViewPager.setAdapter(mSectionsPagerAdapter);

        TabLayout tabLayout = (TabLayout) findViewById(R.id.tabs);
        tabLayout.setupWithViewPager(mViewPager);


    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_technical, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            Intent intent = new Intent(this, Register.class);
            startActivity(intent);
            return true;
        }

        return super.onOptionsItemSelected(item);
    }

    /**
     * A placeholder fragment containing a simple view.
     */
    public static class PlaceholderFragment extends Fragment {
        /**
         * The fragment argument representing the section number for this
         * fragment.
         */
        private static final String ARG_SECTION_NUMBER = "section_number";
        private static final String ARG_EVENT_NAME = "event_name";
        private static final String ARG_EVENT_DESCRIPTION = "event_description";
        private static final String ARG_EVENT_IMAGE = "event_image";

        public PlaceholderFragment() {
        }

        /**
         * Returns a new instance of this fragment for the given section
         * number.
         */
        public static PlaceholderFragment newInstance(int sectionNumber) {
            PlaceholderFragment fragment = new PlaceholderFragment();
            Bundle args = new Bundle();

            args.putInt(ARG_SECTION_NUMBER, sectionNumber);
            args.putString(ARG_EVENT_NAME, events.get(sectionNumber).getEventName());
            args.putString(ARG_EVENT_DESCRIPTION, events.get(sectionNumber).getDescription());
            args.putInt(ARG_EVENT_IMAGE, events.get(sectionNumber).getDrawable());
            fragment.setArguments(args);
            return fragment;
        }

        @Override
        public View onCreateView(LayoutInflater inflater, final ViewGroup container,
                                 Bundle savedInstanceState) {
            View rootView = inflater.inflate(R.layout.fragment_technical, container, false);

            TextView eventName = (TextView) rootView.findViewById(R.id.section_label);
            TextView eventDescription = (TextView) rootView.findViewById(R.id.event_description);
            ImageView eventImage = (ImageView) rootView.findViewById(R.id.event_image);
            Button button = (Button) rootView.findViewById(R.id.button);
            button.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent intent = new Intent(container.getContext(), Register.class);
                    startActivity(intent);
                }
            });
//            textView.setText(getString(R.string.section_format, getArguments().getInt(ARG_SECTION_NUMBER)));
            eventName.setText(getArguments().getString(ARG_EVENT_NAME));
            eventDescription.setText(Html.fromHtml(getArguments().getString(ARG_EVENT_DESCRIPTION)));
            eventImage.setImageResource(getArguments().getInt(ARG_EVENT_IMAGE));
            return rootView;
        }
    }

    /**
     * A {@link FragmentPagerAdapter} that returns a fragment corresponding to
     * one of the sections/tabs/pages.
     */
    public class SectionsPagerAdapter extends FragmentPagerAdapter {

        public SectionsPagerAdapter(FragmentManager fm) {
            super(fm);
        }

        @Override
        public Fragment getItem(int position) {
            // getItem is called to instantiate the fragment for the given page.
            // Return a PlaceholderFragment (defined as a static inner class below).
            return PlaceholderFragment.newInstance(position);
        }

        @Override
        public int getCount() {
            // Show 3 total pages.
            return events.size();
        }

        @Override
        public CharSequence getPageTitle(int position) {
            return events.get(position).getEventName();
//            switch (position) {
//                case 0:
//                    return "Paper Presentation";
//                case 1:
//                    return "Poster Presentation";
//                case 2:
//                    return "Model Exhibition";
//                case 3:
//                    return "Project Exhibition";
//                case 4:
//                    return "Robo Race";
//                case 5:
//                    return "Engineer ka MahaSangram";
//                case 6:
//                    return "Best Business Idea";
//                case 7:
//                    return "Bridge Construction";
//                case 8:
//                    return "Technical Quiz";
//                case 9:
//                    return "Circuitrix";
//                case 10:
//                    return "Mr.Perfect";
//            }
//            return null;
        }
    }
}
