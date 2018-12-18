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
                            "                                        Last Date for submission of your paper in soft copy is 3-Jan-2019.\n" +
                            "                                        Selection of the paper will be notified on 4-Jan-2019.\n" +
                            "                                        <div class=\"panel-group\" id=\"accordion\">\n" +
                            "                                            <div class=\"panel panel-default\">\n" +
                            "                                                <div class=\"panel-heading\">\n" +
                            "                                                    <h4 class=\"panel-title\">\n" +
                            "                                                        <a data-toggle=\"collapse\" data-parent=\"#accordion\" href=\"#acse\">CSE/IT</a>\n" +
                            "                                                    </h4>\n" +
                            "                                                </div>\n" +
                            "                                                <div id=\"acse\" class=\"panel-collapse collapse in\">\n" +
                            "                                                    <div class=\"panel-body\">\n" +
                            "                                                     <p>Machine learning </p>\n" +
                            "                                                        <p>Deep learning </p>\n" +
                            "                                                        <p>Advanced computer networks</p>\n" +
                            "                                                        <p>Big data</p>\n" +
                            "                                                        <p>Data science</p>\n" +
                            "                                                        <p>Cryptography and security</p>\n" +
                            "                                                        \n" +                         "                                                        <p>\n" +
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
                            "                                                         <p> Wireless Communication</p>\n" +
                            "                                                        <p> Mobile Networking</p>\n" +
                            "                                                        <p> Image Processing</p>\n" +
                            "                                                        <p> Embedded Systems</p>\n" +
                            "                                                        <p> Vlsi Technology</p>\n" +
                            "                                                        <p> Nano Technology</p>\n" +
                            "<p>Wireless Networks</p>\n" +
                            "<p>Internet of Things</p>\n" +
                            "<p>Digital Electronics</p>\n" +
                            "<p>Antennas</p>\n" +
                            "<p>Signals & Image processing</p>\n" +
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
                            "                                                        <p>Power Generation</p>\n" +
                            "                                                        <p>Recent trends in Electrical Engineering</p>\n" +
                            "                                                        <p>Green Energy Technology</p>\n" +
                            "                                                        <p>Power Grid</p>\n" +
                            "                                                        <p>Electric Nano Technology</p>\n" +
                            "                                                        <p>Electric Vehicle</p>\n" +
                            "                                                        <p>Industrial Automation and Control Systems</p>\n" +
                            "                                                        <p>Power Electronics and Drives</p>\n" +
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
                            "                                                         <p>Smart helmet for Engineers</p>\n" +
                            "                                                        <p>Drones for Surveying</p>\n" +
                            "                                                        <p>Smart Roads</p>\n" +
                            "                                                        <p>Use of Site Robots in constructions</p>\n" +
                            "                                                        <p>Automation in construction industry</p>\n" +
                            "                                                        <p>Bamboo as a Building Material</p>\n" +
                            "                                                        <p>Construction management life cycle processes</p>\n" +
                            "                                                        <p>Decorative concretes</p>\n" +
                            "<p>Advanced Construction Techniques</p>\n" +
                            "<p>Intelligent Buildings</p>\n" +
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
                    " <b> Rules:</b><br>\n" +
                            "                                        Paper should be in IEEE format, max two authors per team.\n" +
                            "                                        <br>\n" +
                            "                                        Last Date for submission of your paper in soft copy is 3-Jan-2019.\n" +
                            "                                        Selection of the paper will be notified on 4-Jan-2019.\n" +
                            "                                        <div class=\"panel-group\" id=\"accordion\">\n" +
                            "                                            <div class=\"panel panel-default\">\n" +
                            "                                                <div class=\"panel-heading\">\n" +
                            "                                                    <h4 class=\"panel-title\">\n" +
                            "                                                        <a data-toggle=\"collapse\" data-parent=\"#accordion\" href=\"#acse\">CSE/IT</a>\n" +
                            "                                                    </h4>\n" +
                            "                                                </div>\n" +
                            "                                                <div id=\"acse\" class=\"panel-collapse collapse in\">\n" +
                            "                                                    <div class=\"panel-body\">\n" +
                            "                                                     <p>Machine learning </p>\n" +
                            "                                                        <p>Deep learning </p>\n" +
                            "                                                        <p>Advanced computer networks</p>\n" +
                            "                                                        <p>Big data</p>\n" +
                            "                                                        <p>Data science</p>\n" +
                            "                                                        <p>Cryptography and security</p>\n" +
                            "                                                        \n" +                         "                                                        <p>\n" +
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
                            "                                                         <p> Wireless Communication</p>\n" +
                            "                                                        <p> Mobile Networking</p>\n" +
                            "                                                        <p> Image Processing</p>\n" +
                            "                                                        <p> Embedded Systems</p>\n" +
                            "                                                        <p> Vlsi Technology</p>\n" +
                            "                                                        <p> Nano Technology</p>\n" +
                            "<p>Wireless Networks</p>\n" +
                            "<p>Internet of Things</p>\n" +
                            "<p>Digital Electronics</p>\n" +
                            "<p>Antennas</p>\n" +
                            "<p>Signals & Image processing</p>\n" +
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
                            "                                                        <p>Power Generation</p>\n" +
                            "                                                        <p>Recent trends in Electrical Engineering</p>\n" +
                            "                                                        <p>Green Energy Technology</p>\n" +
                            "                                                        <p>Power Grid</p>\n" +
                            "                                                        <p>Electric Nano Technology</p>\n" +
                            "                                                        <p>Electric Vehicle</p>\n" +
                            "                                                        <p>Industrial Automation and Control Systems</p>\n" +
                            "                                                        <p>Power Electronics and Drives</p>\n" +
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
                            "                                                         <p>Smart helmet for Engineers</p>\n" +
                            "                                                        <p>Drones for Surveying</p>\n" +
                            "                                                        <p>Smart Roads</p>\n" +
                            "                                                        <p>Use of Site Robots in constructions</p>\n" +
                            "                                                        <p>Automation in construction industry</p>\n" +
                            "                                                        <p>Bamboo as a Building Material</p>\n" +
                            "                                                        <p>Construction management life cycle processes</p>\n" +
                            "                                                        <p>Decorative concretes</p>\n" +
                            "<p>Advanced Construction Techniques</p>\n" +
                            "<p>Intelligent Buildings</p>\n" +
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
                    R.drawable.poster_presentation));
            events.add(new Event("MODEL EXHIBITION",
                    "   <h4 class=\"text-center\"> Model Exhibition (Diploma)</h4>\n" +
                            "                                        <b> Rules:</b><br>\n" +
                            "                                        Model Exhibition: Should be a team of two members.<br>\n" +
                            "                                        <b><span class=\"text-danger\">For Diploma(all branches) students only.</span></b>\n" +
                            "                                    <br><br>\n" +
                            "                                        <strong>Event Coordinators</strong>\n" +
                            "                                        <br>Faculty: G Ravi, Diploma, ph:8919854816 ",
                    R.drawable.model_exhibition));
            events.add(new Event(" Project Exhibition",
                    "  <h4 class=\"text-center\"> </h4>\n" +
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
                    " <b class=\"text-danger\">Event Co-ordinator: Mr. V Kalapna , T&P,  Ph:99894 10208  </b><br>\n" +
                            "                                        <b> Rules:</b><br>\n" +
                            "                                        Should be presented at the time of event.<br>\n" +
                            "                                        Two members per team.\n" +
                            "                                        <br>Plan should be in PPT.\n" +
                            "                                        <br>Judges decision is final.",
                    R.drawable.business_idea));
//            events.add(new Event(" Bridge Construction",
//                    "" +
//                            "\n" +
//                            "                                        <b class=\"text-danger\">Event Co-ordinator: Mr A.S.Nagaraju,Ph:9000323924  </b><br>\n" +
//                            "\n" +
//                            "                                        <b class=\"text-danger\">Event Co-ordinator: Mr B Vijaya Kumar, Civil,  Ph:8309127880  </b><br>\n" +
//                            "\n" +
//                            "                                        <b> Rules:</b><br>\n" +
//                            "                                        Should be a team of two members.\n" +
//                            "                                        <br>\n" +
//                            "                                        <b> For Engineering and Diploma students.</b>\n" +
//                            "                               \n\n",
//                    R.drawable.bridge_construction));
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
//            events.add(new Event(" Electrospection",
//                    "" +
//                            "                                        <p>\n" +
//                            "\t<b>Event Coordinator: Mr M.Galeeb, ECE, Mobile:- 75695</b></p>\n" +
//                            "\t\t<p>\n" +
//                            "This event has four rounds.</p>\n" +
//                            "\t\t<p>\n" +
//                            "1. &nbsp;<strong>Written Test</strong>:</p>\n" +
//                            "\t\t<p>\n" +
//                            "&middot;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp; 1<sup>st</sup> Year physics, English.</p>\n" +
//                            "\t\t<p>\n" +
//                            "&middot;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp; 2<sup>nd</sup> &amp; 3<sup>rd</sup> Year stld, edc, mesh analysis.</p>\n" +
//                            "\t\t<p>\n" +
//                            "&middot;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp; 20 bits in 20 minutes</p>\n" +
//                            "\t\t<p>\n" +
//                            "2. <strong>Hidden Technical Components</strong>:</p>\n" +
//                            "\t\t<p>\n" +
//                            "&middot;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp; A picture will be shown for 15 sec in the time you have to identify the technical components.</p>\n" +
//                            "\t\t<p>\n" +
//                            "3. <strong>Circuit Designing</strong>:</p>\n" +
//                            "\t\t<p>\n" +
//                            "&middot;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp; You have to connect the circuit as per the giver diagram and show the output waveform.</p>\n" +
//                            "\t\t<p>\n" +
//                            "4. <strong>Quiz</strong>:</p>\n" +
//                            "\t\t<p>\n" +
//                            "&middot;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp; Current Affairs</p>\n" +
//                            "\t\t<p>\n" +
//                            "&nbsp;</p>\n" +
//                            "\t\t<p>\n" +
//                            "<strong>For ECE branch students only(Engineering and Diploma).</strong></p>\n" +
//                            "\t\t<p>\n" +
//                            "&nbsp;</p>\n" +
//                            "\t\t<p>\n" +
//                            "<strong>Rules</strong>:</p>\n" +
//                            "\t\t<p>\n" +
//                            "This event is completely based upon accuracy of circuits.</p>\n" +
//                            "\t\t<p>\n" +
//                            "This event should consist of one participant,</p>\n" +
//                            "\t\t<p>\n" +
//                            "In circuit designing you will be given circuit diagram with all required components you have to select the necessary components.</p>\n" +
//                            "\t\t<p>\n" +
//                            "After completing the circuit your circuit will be tested.</p>\n" +
//                            "\t\t<p>\n" +
//                            "Electrical gadgets are strictly not allowed.</p>\n" +
//                            "\t\t<p>\n" +
//                            "Remaining rules will be announced at time of event.</p>\n" +
//                            "\t\t<p>" +
//                            "&nbsp;</p>" +
//                            "\t\t<p>" +
//                            "<strong>Event Organizers:</strong></p>\n" +
//                            "\t\t<p>" +
//                            "<strong>S.N.V.Sandeep, Ch. Madhuri, Ch. Kavya</strong></p>\n" +
//                            "\t\n" +
//                            "\t\t<p>\n</p>" +
//                            "\t\t<p>\n</p>" +
//                            "\t\t<p>\n</p>" +
//                            "\t\t<p>\n</p>" +
//                            "\t\n\n\n\n\n\n\n" ,
//                    R.drawable.electrospection));

            events.add(new Event("Code Royale",
                    "  <h4 class=\"text-center\"> Code Royale</h4>\n" +
                            "                                        <p style=\"margin-top: 4.5pt;\"><span style=\"font-family: calibri, sans-serif;\"><strong><span style=\"font-size: 14pt; color: red;\">Staff Co-ordinator</span></strong><span style=\"font-size: 14pt; color: red;\">:</span></span></p>\n" +
                            "                                        <p style=\"line-height: 13.6pt;\"><span style=\"font-family: calibri, sans-serif;\">V.RASHMI,&nbsp; +91 9490854890</span></p>\n" +
                            "                                        <p style=\"line-height: 13.6pt;\"><span style=\"font-family: calibri, sans-serif;\">&nbsp;</span></p>\n" +
                            "                                        <p style=\"line-height: 13.6pt;\"><span style=\"font-family: calibri, sans-serif;\"><strong><span style=\"font-size: 14pt; color: red;\">Student Co-ordinator</span></strong><span style=\"font-size: 14pt; color: red;\">:</span></span></p>\n" +
                            "                                        <p><span style=\"font-family: calibri, sans-serif;\">G.SATWIK,&nbsp; +91 7981138937</span></p>\n" +
                            "                                        <p style=\"margin-top: 4.5pt;\"><span style=\"font-family: calibri, sans-serif;\"><span style=\"font-size: 7.5pt;\"><br style=\"page-break-before: auto;\" /></span> <span style=\"font-size: 12pt;\"><br style=\"page-break-before: auto;\" /></span></span></p>\n" +
                            "                                        <p style=\"line-height: 193%; margin: 4.5pt 184.35pt .0001pt 0in;\"><span style=\"font-family: calibri, sans-serif;\"><strong><span style=\"font-size: 14pt; line-height: 193%; color: red;\">Description :</span></strong></span></p>\n" +
                            "                                        <p><span style=\"font-family: calibri, sans-serif;\">Code Royale is the event, which brings out the ultimate challenge for the programmer's thinking abilities. This event consists questions based on logics, solutions and syntaxes of (C,C++,JAVA,PYTHON) and continues to basics of advanced concepts of programming (AI,ML and NN). This competition consists of two rounds.</span></p>\n" +
                            "                                        <p><span style=\"font-family: calibri, sans-serif;\">&nbsp;</span></p>\n" +
                            "                                        <p><span style=\"font-family: calibri, sans-serif;\"><strong>ROUND 1</strong>: Contains questions for screening all the contestants on the multiples of 30(Starting from 60 and based on number of participants).</span></p>\n" +
                            "                                        <p><span style=\"font-family: calibri, sans-serif;\"><strong>ROUND 2</strong>: This takes the winning contestants of round one and will be tested with advanced concepts.</span></p>\n" +
                            "                                        <p><span style=\"font-family: calibri, sans-serif;\">&nbsp;</span></p>\n" +
                            "                                        <p><span style=\"font-family: calibri, sans-serif;\"><strong><span style=\"font-size: 14pt; color: red;\">Rules</span></strong><span style=\"font-size: 14pt;\">:</span></span></p>\n" +
                            "                                        <p style=\"margin-top: 10.1pt;\"><span style=\"font-family: calibri, sans-serif;\"><span style=\"font-size: 12pt;\"><strong>Round 1</strong></span> :</span></p>\n" +
                            "                                        <ul>\n" +
                            "                                        <li style=\"text-indent: .05pt; tab-stops: 53.5pt;\"><span style=\"font-size: 12pt; font-family: calibri, sans-serif;\">All the questions are multiple-choice</span></li>\n" +
                            "                                        </ul>\n" +
                            "                                        <ul>\n" +
                            "                                        <li style=\"margin-right: 11.95pt; text-indent: 0in; line-height: 121%; tab-stops: 53.45pt;\"><span style=\"font-size: 12pt; line-height: 121%; font-family: calibri, sans-serif;\">This round consists of 30 questions with the total of 30 minutes (for all 30questions). Contestants with more accurate answers will be selected for round </span></li>\n" +
                            "                                        </ul>\n" +
                            "                                        <p><span style=\"font-family: calibri, sans-serif;\">Note: Total number of contestants selected is based on total number of participants.</span></p>\n" +
                            "                                        <p><span style=\"font-family: calibri, sans-serif;\"><strong><span style=\"font-size: 12pt;\">Round</span> 2</strong> :</span></p>\n" +
                            "                                        <ul>\n" +
                            "                                        <li style=\"margin-top: 2.05pt; tab-stops: 41.0pt;\"><span style=\"font-size: 12pt; font-family: calibri, sans-serif;\">All the selected contestants are given with 40 questions (either multiple choice or direct solutions).</span></li>\n" +
                            "                                        </ul>\n" +
                            "                                        <p style=\"tab-stops: 41.0pt; margin: 2.05pt 0in .0001pt 23.0pt;\"><span style=\"font-size: 12pt; font-family: calibri, sans-serif;\">Note: first 11 questions are considered as single set. From 11th question, each question will be considered as single set.</span></p>\n" +
                            "                                        <ul>\n" +
                            "                                        <li style=\"margin-top: 2.05pt; tab-stops: 41.0pt;\"><span style=\"font-size: 12pt; font-family: calibri, sans-serif;\">New question will be given only after previous question is locked for checking the answer.</span></li>\n" +
                            "                                        </ul>\n" +
                            "                                        <ul>\n" +
                            "                                        <li style=\"margin-top: 2.05pt; tab-stops: 41.0pt;\"><span style=\"font-size: 12pt; font-family: calibri, sans-serif;\">Contestants in this round are eliminated based on 2 factors.</span></li>\n" +
                            "                                        </ul>\n" +
                            "                                        <p style=\"margin-top: 2.05pt; tab-stops: 41.0pt;\"><span style=\"font-size: 12pt; font-family: calibri, sans-serif;\">&nbsp;</span></p>\n" +
                            "                                        <ul>\n" +
                            "                                        <li style=\"tab-stops: 41.0pt; margin: 2.05pt 0in .0001pt .5in;\"><span style=\"font-size: 12pt; font-family: calibri, sans-serif;\">TIME: For every question answered, time taken to solve is considered. the person with more time factor will be eliminated after each set.</span></li>\n" +
                            "                                        <li style=\"tab-stops: 41.0pt; margin: 2.05pt 0in .0001pt .5in;\"><span style=\"font-size: 12pt; font-family: calibri, sans-serif;\">WRONG ANSWER: 10 chances will be given to the contestant. After 10th mistake she/he makes, contestant will be eliminated.</span></li>\n" +
                            "                                        </ul>\n" +
                            "                                        <p style=\"margin-top: 2.05pt; tab-stops: 41.0pt;\"><span style=\"font-size: 12pt; font-family: calibri, sans-serif;\">Note: Only 10 chances will be given for whole round. Chance does not move to next question. It gives ability to answer the same question repeatedly until it is answered correct.</span></p>\n" +
                            "                                        <p style=\"line-height: 122%; margin: 9.95pt 5.8pt .0001pt 5.0pt;\"><span style=\"font-family: calibri, sans-serif;\"><strong>WINNER: Based on the above rules and factors, the top contestant with fastest solving skills will be entitled as winner!!</strong></span></p>\n" +
                            "                                        <p>&nbsp;</p>",
                    R.drawable.code));



//
//            events.add(new Event("Circuitrix",
//                    "<b class=\"text-danger\">Event Co-ordinator: Mr Ch.Srinivas, ECE,  Ph:9985700821 </b><br>\n" +
//                            "                                        <p>This event will be organized by the III year ECE students<br>\n" +
//                            "                                            The event consist of 4 rounds.<br>\n" +
//                            "                                            1. Written test[ Aptitute, EDC, Basic Physics, STLD, ET] -20 bits - 20 Mins<br>\n" +
//                            "                                            2. Components Identification <br>\n" +
//                            "                                            using color coding, IC numbers etc..<br>\n" +
//                            "                                            PIN names. 20sec per head<br>\n" +
//                            "                                            3. Circuit Designing:<br>\n" +
//                            "                                            Connect the circuit as per the diagram and show the output\n" +
//                            "                                            <br>\n" +
//                            "                                            4. Quiz: Current affairs\n" +
//                            "                                            <br>\n" +
//                            "                                            Spot Registrations are accepted.<br>\n" +
//                            "                                            The event will be conducted on 5/1/18\n" +
//                            "                                            <br>\n" +
//                            "                                            Timings: will be start around 10:00 AM\n" +
//                            "                                            <br>Participation certificates will be given\n" +
//                            "                                        </p>\n" +
//                            "                                        <b> Rules:</b><br>\n" +
//                            "                                        Will be announced on spot\n" +
//                            "\t\t<p>\n</p>" +
//                            "\t\t<p>\n</p>" +
//                            "\t\t<p>\n</p>" +
//                            "\t\t<p>\n</p>" +
//                            "\t\n\n\n\n\n\n\n"
//                            ,
//                    R.drawable.circuitrix));



            events.add(new Event("Crypt yoUR Mind",
                    " <p style=\"margin-top: 4.5pt;\"><strong><span style=\"font-size: 14.0pt; font-family: 'Calibri','sans-serif'; color: red;\">Staff Co-ordinator</span></strong><span style=\"font-size: 14.0pt; font-family: 'Calibri','sans-serif'; color: red;\">:</span></p>\n" +
                            "                                        <p style=\"tab-stops: 23.55pt;\"><span style=\"font-size: 12.0pt; font-family: 'Calibri','sans-serif';\">M.Siva Sankar Nayak Ph:9177720194</span></p>\n" +
                            "                                        <p style=\"line-height: 13.6pt;\"><strong><span style=\"font-size: 14.0pt; font-family: 'Calibri','sans-serif'; color: red;\">Student Co-ordinator</span></strong><span style=\"font-size: 14.0pt; font-family: 'Calibri','sans-serif'; color: red;\">:</span></p>\n" +
                            "                                        <p><span style=\"font-family: 'Calibri','sans-serif';\">V . Satya Sagar Ph:7674868509</span></p>\n" +
                            "                                        <p style=\"line-height: 193%; margin: 4.5pt 184.35pt .0001pt 0in;\"><strong><span style=\"font-size: 14.0pt; line-height: 193%; font-family: 'Calibri','sans-serif'; color: red;\">Description :</span></strong></p>\n" +
                            "                                        <p style=\"margin-top: .2pt;\"><span style=\"font-family: 'Calibri','sans-serif';\">Crypt your mind event is based on ethical hacking technics of encryption and decryption</span><span style=\"font-family: 'Calibri','sans-serif';\">. This game consists of two rounds. The candidates will be asked to decrypt the given keyword which are encrypted under few conditions. It is an online event. Top two members who passed both rounds will be awarded.</span></p>\n" +
                            "                                        <p><strong><span style=\"font-size: 14.0pt; font-family: 'Calibri','sans-serif'; color: red;\">Rules</span></strong><span style=\"font-size: 14.0pt; font-family: 'Calibri','sans-serif';\">:</span></p>\n" +
                            "                                        <p style=\"margin-top: 10.1pt;\"><strong><span style=\"font-family: 'Calibri','sans-serif';\">Round 1 :</span></strong></p>\n" +
                            "                                        <ul>\n" +
                            "                                        <li style=\"margin-left: 59.0pt; tab-stops: 58.95pt 59.0pt;\"><span style=\"font-size: 12.0pt; font-family: 'Calibri','sans-serif';\">The question paper consists of 50 questions</span></li>\n" +
                            "                                        <li style=\"tab-stops: 58.95pt 59.0pt; margin: 2.65pt 0in .0001pt 59.0pt;\"><span style=\"font-size: 12.0pt; font-family: 'Calibri','sans-serif';\">Each question is encrypted under 3 conditions</span></li>\n" +
                            "                                        <li style=\"tab-stops: 58.95pt 59.0pt; margin: 2.65pt 0in .0001pt 59.0pt;\"><span style=\"font-size: 12.0pt; font-family: 'Calibri','sans-serif';\">Time limit for each candidate is 30 minutes</span></li>\n" +
                            "                                        <li style=\"tab-stops: 58.95pt 59.0pt; margin: 2.5pt 0in .0001pt 59.0pt;\"><span style=\"font-size: 12.0pt; font-family: 'Calibri','sans-serif';\">Top 20 members will be promoted to next level</span></li>\n" +
                            "                                        </ul>\n" +
                            "                                        <p><strong><span style=\"font-family: 'Calibri','sans-serif';\">Round 2 :</span></strong></p>\n" +
                            "                                        <ul>\n" +
                            "                                        <li style=\"margin-left: 59.0pt; tab-stops: 58.95pt 59.0pt;\"><span style=\"font-size: 12.0pt; font-family: 'Calibri','sans-serif';\">The question paper consists of 30 questions</span></li>\n" +
                            "                                        <li style=\"tab-stops: 58.95pt 59.0pt; margin: 2.65pt 0in .0001pt 59.0pt;\"><span style=\"font-size: 12.0pt; font-family: 'Calibri','sans-serif';\">Each question is encrypted under 5 conditions</span></li>\n" +
                            "                                        <li style=\"tab-stops: 58.95pt 59.0pt; margin: 2.5pt 0in .0001pt 59.0pt;\"><span style=\"font-size: 12.0pt; font-family: 'Calibri','sans-serif';\">Time limit for each candidate is 20 minutes</span></li>\n" +
                            "                                        </ul>"+
                            "\t\t<p>\n</p>" +
                            "\t\t<p>\n</p>" +
                            "\t\t<p>\n</p>" +
                            "\t\t<p>\n</p>" +
                            "\t\t\n\n\n\n\n  " ,
                    R.drawable.crypt));



            events.add(new Event("Google Master",
                    "<p style=\"margin-top: 4.5pt;\"><span style=\"font-family: calibri, sans-serif;\"><strong><span style=\"font-size: 14pt; color: red;\">Staff Co-ordinator</span></strong><span style=\"font-size: 14pt; color: red;\">:</span></span></p>\n" +
                            "                                        <p style=\"margin-top: 4.5pt;\"><span style=\"font-family: calibri, sans-serif; color: #000000;\"><span style=\"font-size: 11pt;\">K.Vijaya Durga</span><span style=\"font-size: 11pt;\">, CSE , Ph: 8186933162</span></span></p>\n" +
                            "                                        <p style=\"tab-stops: 23.55pt;\">&nbsp;</p>\n" +
                            "                                        <p style=\"line-height: 13.6pt;\"><span style=\"font-family: calibri, sans-serif; color: #000000;\"><strong><span style=\"font-size: 14pt;\">Student Co-ordinator</span></strong><span style=\"font-size: 14pt;\">:</span></span></p>\n" +
                            "                                        <p><span style=\"font-family: calibri, sans-serif; color: #000000;\"><span style=\"font-size: 11pt;\">Sai Saran</span><span style=\"font-size: 11pt;\">,CSE,Ph:8074006214</span> </span></p>\n" +
                            "                                        <p><span style=\"color: #000000;\"><span style=\"font-size: 12pt; font-family: calibri, sans-serif;\">Google Master is a event which tests the logical abilities of a person through the searching abilities which is mostly required by any individual in the real world.</span></span></p>\n" +
                            "                                        <p><span style=\"color: #000000;\"><strong><span style=\"font-size: 14pt; font-family: calibri, sans-serif;\">Procedure:</span></strong></span></p>\n" +
                            "                                        <p><span style=\"font-size: 12pt; font-family: calibri, sans-serif; color: #000000;\">The participant is given a set of questions where he free to use all the available resuorces like internet,third party apps etc to retrive the answer.the first person to unbox all the answers will be awarded as the google master.</span></p>\n" +
                            "                                        <p><strong><span style=\"font-size: 14.0pt; font-family: 'Calibri','sans-serif'; color: red;\">Rules</span></strong><span style=\"font-size: 14.0pt; font-family: 'Calibri','sans-serif';\">:</span></p>\n" +
                            "                                        <ol>\n" +
                            "                                        <li><span style=\"color: #000000;\">Only individual participant is allowed.</span></li>\n" +
                            "                                        <li><span style=\"color: #000000;\">The event will be started at a time for all the candidates. The time limit for this event will be 30mins.</span></li>\n" +
                            "                                        <li><span style=\"color: #000000;\">Consists of 5 questions and all should be answered correctly .</span></li>\n" +
                            "                                        <li><span style=\"color: #000000;\">If the 1<span style=\"font-size: 8.0pt; line-height: 115%; position: relative; top: -4.0pt;\">st </span>question answer is correct, then only the next question will be displaced and vice- versa.</span></li>\n" +
                            "                                        <li><span style=\"color: #000000;\">The participant is free to use the internet to search for the answers. Communicating to the other person is not allowed.</span></li>\n" +
                            "                                        </ol>\n" +
                            "                                        <p><span style=\"font-size: 14pt; font-family: calibri, sans-serif; color: #ff0000;\"><strong>Rounds</strong></span></p>\n" +
                            "                                        <p><span style=\"color: #000000;\"><u>Round 1</u>: Google Surfer</span></p>\n" +
                            "                                        <ol>\n" +
                            "                                        <li><span style=\"color: #000000;\">This round consists of 10 Questions.</span></li>\n" +
                            "                                        <li><span style=\"color: #000000;\">Time limit is 20 minutes.</span></li>\n" +
                            "                                        <li><span style=\"color: #000000;\">The best performed 30% of the students are promoted to round 2.</span></li>\n" +
                            "                                        </ol>\n" +
                            "                                        <p><span style=\"color: #000000;\"><u>Round 2</u>: Google Master</span></p>\n" +
                            "                                        <ol>\n" +
                            "                                        <li><span style=\"color: #000000;\">This round consists of 5 Questions.</span></li>\n" +
                            "                                        <li><span style=\"color: #000000;\">The time limit is 30 minutes.</span></li>\n" +
                            "                                        <li><span style=\"color: #000000;\">The first participant to solve the Maximum number of questions is the google master.</span></li>\n" +
                            "                                        <li><span style=\"color: #000000;\">The second participant to solve the Maximum number of Questions is the Runner.</span></li>\n" +
                            "                                        <li><span style=\"color: #000000;\">This event is fully based on time limit.</span></li>\n" +
                            "                                        </ol>\n" +
                            "                                        <p><span style=\"color: #000000;\">(Note: you are disqualified if you are unable to complete the task in provided time)</span></p>"+ "\t\t<p>\n</p>" +
                            "\t\t<p>\n</p>" +
                            "\t\t<p>\n</p>" +
                            "\t\t<p>\n</p>" +
                            "\t\t\n\n\n\n\n  " ,
                    R.drawable.googlemaster));



            events.add(new Event("Water Rockets",
                    " <p align=\"center\">\n" +
                            "                                            <strong>Event Co-ordinator : Mr V Ajay Kumar; &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;Dept: Mech&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp; &nbsp;Ph:9490501085</strong></p>\n" +
                            "\t <strong>Student Co-ordinators : V.Lalith sai,B.Bharagav Shanker; &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;Phone no: 8978445277,9849437710</strong></p>\n" +
                            "\t\t\n" +
                            "\t<ol><p><span style=\"font-size: 12pt; font-family: calibri, sans-serif;\">Student coordinators: V.Lalith sai,B.Bharagav Shanker</span></p>\n" +
                            "<p><span style=\"font-size: 12pt; font-family: calibri, sans-serif;\">Phone no: 8978445277,9849437710</span></p>\n" +
                            "<li><span style=\"font-size: 12pt; font-family: calibri, sans-serif;\"><span style=\"line-height: 150%; color: #222222;\">A&nbsp;<strong>water rocket&nbsp;</strong>is a type of&nbsp;</span><a href=\"https://en.wikipedia.org/wiki/Model_rocket\"><span style=\"line-height: 150%; color: #0b0080; text-decoration: none;\">model rocket&nbsp;</span></a><span style=\"line-height: 150%; color: #222222;\">using&nbsp;</span><a href=\"https://en.wikipedia.org/wiki/Water\"><span style=\"line-height: 150%; color: #0b0080; text-decoration: none;\">water</span></a><span style=\"line-height: 150%; color: #222222;\">&nbsp;as its&nbsp;</span><a href=\"https://en.wikipedia.org/wiki/Reaction_mass\"><span style=\"line-height: 150%; color: #0b0080; text-decoration: none;\">reaction mass</span></a><span style=\"line-height: 150%; color: #222222;\">. </span></span></li>\n" +
                            "<li><span style=\"font-size: 12pt; font-family: calibri, sans-serif;\"><span style=\"line-height: 150%; color: #222222;\"> The water is forced out by a pressurized gas (typically&nbsp;</span><a href=\"https://en.wikipedia.org/wiki/Compressed_air\"><span style=\"line-height: 150%; color: #0b0080; text-decoration: none;\">compressed air</span></a><span style=\"line-height: 150%; color: #222222;\"> only) it operates on the principle of&nbsp;</span><a href=\"https://en.wikipedia.org/wiki/Newton%27s_third_law\"><span style=\"line-height: 150%; color: #0b0080; text-decoration: none;\">Newton's third law of motion</span></a><span style=\"line-height: 150%; color: #222222;\">. </span></span></li>\n" +
                            "<li><span style=\"font-size: 12pt; font-family: calibri, sans-serif;\"><span style=\"line-height: 150%; color: #222222;\"> Water rocket hobbyists typically use one or more plastic&nbsp;</span><a href=\"https://en.wikipedia.org/wiki/Soft_drink\"><span style=\"line-height: 150%; color: #0b0080; text-decoration: none;\">soft drink&nbsp;</span></a><span style=\"line-height: 150%; color: #222222;\">bottle as the rocket's pressure vessel. A variety of designs are possible. </span></span></li>\n" +
                            "<li><span style=\"font-size: 12pt; font-family: calibri, sans-serif;\"><span style=\"line-height: 150%; color: #222222;\"> Water rockets are also custom-built from </span><a href=\"https://en.wikipedia.org/wiki/Soft_drink\"><span style=\"line-height: 150%; color: #0b0080; text-decoration: none;\">soft drink&nbsp;</span></a><span style=\"line-height: 150%; color: #222222;\">bottle to achieve their altitudes.</span></span></li>\n" +
                            "<li><span style=\"font-size: 12pt; font-family: calibri, sans-serif;\">Winner can decide dependence on the measured horizontal distance.</span></li>\n" +
                            "<li><span style=\"font-size: 12pt; font-family: calibri, sans-serif;\">Each person can attained 3 times, take best of one.</span></li>\n" +
                            "</ol>"+ "\t\t<p>\n</p>" +
                            "\t\t<p>\n</p>" +
                            "\t\t<p>\n</p>" +
                            "\t\t<p>\n</p>" +
                            "\t\t\n\n\n\n\n  " ,
                    R.drawable.waterrockets));

            events.add(new Event("3D MODELING MANIA",
                    "<p style=\"margin-bottom: 0.0001pt;\"><span style=\"font-size: 12pt; line-height: 115%; font-family: calibri, sans-serif;\"><span style=\"color: #002060;\"><span style=\"color: #ff0000;\"><strong>CO-ORDINATOR</strong>:</span> N.SAI PAVAN [<strong>8985256626</strong>]</span></span></p>\n" +
                            "<p style=\"margin-bottom: 0.0001pt;\"><span style=\"font-size: 12pt; line-height: 115%; font-family: calibri, sans-serif; color: #002060;\"><strong><span style=\"color: #ff0000;\">Number of Participants</span></strong>: 1</span></p>\n" +
                            "<p style=\"margin-bottom: .0001pt;\"><span style=\"font-size: 12pt; line-height: 115%; font-family: calibri, sans-serif; color: #ff0000;\"><strong><u>Rules and Guidelines:</u></strong></span></p>\n" +
                            "<ol>\n" +
                            "<li><span style=\"line-height: 115%; font-family: calibri, sans-serif; font-size: 12pt; color: #000000;\">No of participants-1 </span></li>\n" +
                            "<li><span style=\"font-family: calibri, sans-serif; font-size: 12pt; color: #000000;\"><span style=\"line-height: 115%;\">The registered </span><a style=\"color: #000000;\" href=\"https://www.google.com/search?q=participants&amp;spell=1&amp;sa=X&amp;ved=0ahUKEwiAuZ-rv_HeAhVJLY8KHRDPDNQQkeECCCooAA\"><span style=\"line-height: 115%; background: white; text-decoration: none;\">participants</span></a><span style=\"line-height: 115%;\"> will be intimated regarding the concept of building which should be modeled and rendered before a week of the fest.</span></span></li>\n" +
                            "<li><span style=\"line-height: 115%; font-family: calibri, sans-serif; font-size: 12pt; color: #000000;\">The participants can use any of the software like 3DS MAX or SKETCH-UP.</span></li>\n" +
                            "<li><span style=\"line-height: 115%; font-family: calibri, sans-serif; font-size: 12pt; color: #000000;\">Students have to follow the NBC norms when they are preparing a model.</span></li>\n" +
                            "<li><span style=\"line-height: 115%; font-family: calibri, sans-serif; font-size: 12pt; color: #000000;\">Prizes will be given to the more creative and in detailed rendering models.</span></li>\n" +
                            "<li><span style=\"line-height: 115%; font-family: calibri, sans-serif; font-size: 12pt; color: #000000;\">Judges has the right to admission to add or remove the models.</span></li>\n" +
                            "</ol>\n" +
                            "<p style=\"margin-bottom: .0001pt;\"><span style=\"font-family: calibri, sans-serif; font-size: 12pt; color: #ff0000;\"><strong><span style=\"line-height: 115%;\">Awarding criteria:</span></strong></span></p>\n" +
                            "<p style=\"margin-bottom: .0001pt;\"><span style=\"font-size: 12pt; line-height: 115%; font-family: calibri, sans-serif; color: #000000;\">Candidates has to show the concept clearly and use the contents should be in 2 min or less. They should be capable of showing each element in detailed with in time.</span></p>\n" +
                            "<p style=\"margin-bottom: .0001pt;\"><span style=\"font-family: calibri, sans-serif; font-size: 12pt; color: #000000;\"><strong><span style=\"line-height: 115%;\">Example:</span></strong><span style=\"line-height: 115%;\"> URCE campus plan</span></span></p>\n" +
                            "                                   " +
                            "\t\t<p>\n</p>" +
                            "\t\t<p>\n</p>" +
                            "\t\t<p>\n</p>" +
                            "\t\t\n\n\n\n\n  " ,
                    R.drawable.model));
            events.add(new Event("BEST DESIGNER",
                    "<p style=\"margin-bottom: 0.0001pt;\"><span style=\"font-family: calibri, sans-serif;\"><span style=\"font-size: 12pt; line-height: 115%;\"><span style=\"color: #002060;\"><span style=\"color: #ff0000;\"><strong>CO-ORDINATOR</strong>:&nbsp;</span></span></span><span style=\"font-size: 10pt; line-height: 115%; color: #000000;\">N.RAGHAVENDRA[9533856284]</span></span></p>\n" +
                            "                                            <p style=\"margin-bottom: 0.0001pt;\"><span style=\"font-size: 12pt; line-height: 115%; font-family: calibri, sans-serif; color: #002060;\"><strong><span style=\"color: #ff0000;\">Number of Participants</span></strong>: 1</span></p>\n" +
                            "                                            <p style=\"margin-bottom: .0001pt;\"><span style=\"font-size: 12pt; line-height: 115%; font-family: calibri, sans-serif; color: #ff0000;\"><strong><u>Rules and Guidelines:</u></strong></span></p>\n" +
                            "                                            <ol>\n" +
                            "                                            <li><span style=\"font-family: calibri, sans-serif; color: #000000;\">No of participants:1</span></li>\n" +
                            "                                            <li><span style=\"font-family: calibri, sans-serif; color: #000000;\">The registered participants will be given a model on the day of fest by the evaluators.</span></li>\n" +
                            "                                            <li><span style=\"font-family: calibri, sans-serif; color: #000000;\">Participants are admitted to use the software <strong>STAAD-PRO</strong></span></li>\n" +
                            "                                            <li><span style=\"font-family: calibri, sans-serif; color: #000000;\">Participants have to design and analyze the given model by satisfying the all code provisions.</span></li>\n" +
                            "                                            <li><span style=\"font-family: calibri, sans-serif; color: #000000;\">With in 1 hour participants have to design and perform their analysis.</span></li>\n" +
                            "                                            <li><span style=\"font-family: calibri, sans-serif; color: #000000;\">Prizes will be given to the more creative and in detailed analysis that follow maximum codes.</span></li>\n" +
                            "                                            <li><span style=\"font-family: calibri, sans-serif; color: #000000;\">Judges has the right to admission to add or remove the models.</span></li>\n" +
                            "                                            </ol>\n" +
                            "                                            <p>&nbsp;</p>\n" +
                            "                                            <p style=\"margin-bottom: .0001pt;\"><span style=\"font-family: calibri, sans-serif; font-size: 12pt; color: #ff0000;\"><strong><span style=\"line-height: 115%;\">Awarding criteria:</span></strong></span></p>\n" +
                            "                                            <ul>\n" +
                            "                                            <li><span style=\"font-size: 12pt; line-height: 115%; font-family: calibri, sans-serif; color: #000000;\">Candidate has to analyze the given model with in 30 min of time.</span></li>\n" +
                            "                                            <li><span style=\"font-size: 12pt; line-height: 115%; font-family: calibri, sans-serif; color: #000000;\">Priority will be given to the person who will complete the analysis in less time with less errors.</span></li>\n" +
                            "                                            </ul>\n" +
                            "                                            <p style=\"margin-bottom: .0001pt;\">&nbsp;</p>" +
                            "\t\t<p>\n</p>" +
                            "\t\t<p>\n</p>" +
                            "\t\t<p>\n</p>" +
                            "\t\t\n\n\n\n\n  " ,
                    R.drawable.designer));
            events.add(new Event("BEST CONCRETE MAKER",
                    " <p style=\"margin-bottom: 0.0001pt;\"><span style=\"font-family: calibri, sans-serif;\"><span style=\"font-size: 12pt; line-height: 115%;\"><span style=\"color: #002060;\"><span style=\"color: #ff0000;\"><strong>CO-ORDINATOR</strong>: <span style=\"font-size: 10pt; line-height: 115%; color: #000000;\">A.K.NILAKANTAM[8096576036]</span></span></span></span></span></p>\n" +
                            "<p style=\"margin-bottom: 0.0001pt;\"><span style=\"font-size: 12pt; line-height: 115%; font-family: calibri, sans-serif; color: #002060;\"><strong><span style=\"color: #ff0000;\">Number of Participants</span></strong>: 1</span></p>\n" +
                            "<p style=\"margin-bottom: .0001pt;\"><span style=\"font-size: 12pt; line-height: 115%; font-family: calibri, sans-serif; color: #ff0000;\"><strong><u>Rules and Guidelines:</u></strong></span></p>\n" +
                            "<ol>\n" +
                            "<li><span style=\"font-family: calibri, sans-serif; color: #000000;\">The event will be conducted on the day of fest.</span></li>\n" +
                            "<li><span style=\"font-family: calibri, sans-serif; color: #000000;\">All the participants will be given a concrete mix design problems on a particular grade of concrete and some conditions.</span></li>\n" +
                            "<li><span style=\"font-family: calibri, sans-serif; color: #000000;\">The design has to obey the all the code norms</span></li>\n" +
                            "<li><span style=\"font-family: calibri, sans-serif; color: #000000;\">Prizes will be given to the persons who will design in less time and most economic point of view.</span></li>\n" +
                            "<li><span style=\"font-family: calibri, sans-serif; color: #000000;\">Judges has the right to take any decision regarding the event.</span></li>\n" +
                            "</ol>\n" +
                            "<p>&nbsp;</p>\n" +
                            "<p style=\"margin-bottom: .0001pt;\"><span style=\"font-family: calibri, sans-serif; font-size: 12pt; color: #ff0000;\"><strong><span style=\"line-height: 115%;\">Awarding criteria:</span></strong></span></p>\n" +
                            "<ul>\n" +
                            "<li><span style=\"font-size: 12pt; line-height: 115%; font-family: calibri, sans-serif; color: #000000;\">Candidate has to calculate the concrete proportions in less time.</span></li>\n" +
                            "<li><span style=\"font-size: 12pt; line-height: 115%; font-family: calibri, sans-serif; color: #000000;\">Candidate should calculate the optimum proportions.</span></li>\n" +
                            "</ul>\n" +
                            "<p style=\"margin-bottom: .0001pt;\">&nbsp;</p>" +
                            "\t\t<p>\n</p>" +
                            "\t\t<p>\n</p>" +
                            "\t\t<p>\n</p>" +
                            "\t\t\n\n\n\n\n  " ,
                    R.drawable.concrete));
            events.add(new Event("Technothon",
                    "  <p style=\"margin-top: 4.5pt;\"><strong><span style=\"font-size: 14.0pt; font-family: 'Calibri','sans-serif'; color: red;\">Staff Co-ordinator</span></strong><span style=\"font-size: 14.0pt; font-family: 'Calibri','sans-serif'; color: red;\">:</span></p>\n" +
                            "                                        <ol>\n" +
                            "                                        <li style=\"line-height: 13.6pt;\">Ramya Mounika (96529-71990)</li>\n" +
                            "                                        </ol>\n" +
                            "                                        <p style=\"line-height: 13.6pt;\"><strong><span style=\"font-size: 14.0pt; font-family: 'Calibri','sans-serif'; color: red;\">Student Co-ordinator</span></strong><span style=\"font-size: 14.0pt; font-family: 'Calibri','sans-serif'; color: red;\">:</span></p>\n" +
                            "                                        <ol>\n" +
                            "                                        <li>Omkar Sai Prasad (79899-33945)</li>\n" +
                            "                                        </ol>\n" +
                            "                                        <p><strong><span style=\"font-size: 14.0pt; font-family: 'Calibri','sans-serif'; color: red;\">Description :</span></strong></p>\n" +
                            "                                        <p><span style=\"font-family: 'Calibri','sans-serif';\">Technothon is a Coding event conducted on the 1st day of the fest. This event is focused to enhance the problem-solving skills of the student. This event is designed to test the basic knowledge in C Programming Language and ranging to the complex problems.</span></p>\n" +
                            "                                        <p><span style=\"font-family: 'Calibri','sans-serif';\">The participants are invited from all the branches with interest in Programming. This event consists of three rounds.</span></p>\n" +
                            "                                        <p>&nbsp;</p>\n" +
                            "                                        <p><strong><span style=\"font-family: 'Calibri','sans-serif';\">Round 1</span></strong><span style=\"font-family: 'Calibri','sans-serif';\">: This round consists 30 multiple choice questions on Basic C Programming Language. And the time limit for this round is 30 minutes.</span></p>\n" +
                            "                                        <p><strong><span style=\"font-family: 'Calibri','sans-serif';\">Round 2</span></strong><span style=\"font-family: 'Calibri','sans-serif';\">: The students who are qualified in the first round will be invited for the second round.</span></p>\n" +
                            "                                        <p><span style=\"font-family: 'Calibri','sans-serif';\">In second round, firstly output for a problem will be given. Next, the code will be given but with Bugs. The participant is required to find the bugs in the code and display the output as shown before.</span></p>\n" +
                            "                                        <p><strong><span style=\"font-family: 'Calibri','sans-serif';\">Round 3</span></strong><span style=\"font-family: 'Calibri','sans-serif';\">: The selected students in the second round are eligible for the final round.</span></p>\n" +
                            "                                        <p><span style=\"font-family: 'Calibri','sans-serif';\">This round is blind coding in which a problem statement is given to be coded on IDE with the display off.</span></p>\n" +
                            "                                        <p>&nbsp;</p>\n" +
                            "                                        <p><span style=\"font-family: 'Calibri','sans-serif';\">The participants with minimum errors or clear output in given time will be awarded.</span></p>\n" +
                            "                                        <p><span style=\"font-family: 'Calibri','sans-serif';\">&nbsp;</span></p>\n" +
                            "                                        <p><strong><span style=\"font-size: 14.0pt; font-family: 'Calibri','sans-serif'; color: red;\">Rules</span></strong><span style=\"font-size: 14.0pt; font-family: 'Calibri','sans-serif';\">:</span></p>\n" +
                            "                                        <ul>\n" +
                            "                                        <li><span style=\"font-size: 12.0pt; font-family: 'Calibri','sans-serif';\"> Only individual participants are allowed for this event.</span></li>\n" +
                            "                                        </ul>\n" +
                            "                                        <ul>\n" +
                            "                                        <li><span style=\"font-size: 12.0pt; font-family: 'Calibri','sans-serif';\"> The participant must register before entering.</span></li>\n" +
                            "                                        </ul>\n" +
                            "                                        <ul>\n" +
                            "                                        <li><span style=\"font-size: 12.0pt; font-family: 'Calibri','sans-serif';\"> The registration fee for this event is 100/-</span></li>\n" +
                            "                                        </ul>\n" +
                            "                                        <ul>\n" +
                            "                                        <li><span style=\"font-size: 12.0pt; font-family: 'Calibri','sans-serif';\"> A computer will be provided to each participant.</span></li>\n" +
                            "                                        </ul>\n" +
                            "                                        <ul>\n" +
                            "                                        <li><span style=\"font-size: 12.0pt; font-family: 'Calibri','sans-serif';\"> The exchange of any written code or any participant found talking to other participants will not be encouraged.</span></li>\n" +
                            "                                        </ul>" +
                            "\t\t<p>\n</p>" +
                            "\t\t<p>\n</p>" +
                            "\t\t<p>\n</p>" +
                            "\t\t\n\n\n\n\n  " ,
                    R.drawable.technothon));

            events.add(new Event("Tech Synonyms",
                "  <p style=\"margin-top: 4.5pt;\"><strong><span style=\"font-size: 14.0pt; font-family: 'Calibri','sans-serif'; color: red;\">Staff Co-ordinator</span></strong><span style=\"font-size: 14.0pt; font-family: 'Calibri','sans-serif'; color: red;\">:</span></p>\n" +
                        "<p style=\"line-height: 13.6pt;\">K . Sirisha Ph: 6300364808</p>\n" +
                        "<p style=\"line-height: 13.6pt;\"><span style=\"font-family: 'Calibri','sans-serif';\">&nbsp;</span></p>\n" +
                        "<p style=\"line-height: 13.6pt;\"><strong><span style=\"font-size: 14.0pt; font-family: 'Calibri','sans-serif'; color: red;\">Student Co-ordinator</span></strong><span style=\"font-size: 14.0pt; font-family: 'Calibri','sans-serif'; color: red;\">:</span></p>\n" +
                        "<p>K . Bhanu Phani Venkat Ph: 9502305784</p>\n" +
                        "<p>&nbsp;</p>\n" +
                        "<p><strong><span style=\"font-size: 14.0pt; font-family: 'Calibri','sans-serif'; color: red;\">Description :</span></strong></p>\n" +
                        "<p><span style=\"font-family: 'Calibri','sans-serif';\">Tech synonyms is a modified version of English synonyms with Technical terms . Here the candidate will be asked to find the alternative usage of a device. It is a pen and paper event. This event has only two round, in which the top two members will be awarded.</span></p>\n" +
                        "<p><span style=\"font-family: 'Calibri','sans-serif';\">&nbsp;</span></p>\n" +
                        "<p><strong><span style=\"font-family: 'Calibri','sans-serif';\">Round 1</span></strong><span style=\"font-family: 'Calibri','sans-serif';\"> :</span></p>\n" +
                        "<ol>\n" +
                        "<li><span style=\"font-family: 'Calibri','sans-serif';\">The candidate will be given 30 questions</span></li>\n" +
                        "<li><span style=\"font-family: 'Calibri','sans-serif';\">Each question has multiple options out of which only one suits the best.</span></li>\n" +
                        "<li><span style=\"font-family: 'Calibri','sans-serif';\">Time limit for each candidate is 20 minutes</span>&nbsp;</li>\n" +
                        "</ol>\n" +
                        "<p><strong><span style=\"font-family: 'Calibri','sans-serif';\">Round 2</span></strong><span style=\"font-family: 'Calibri','sans-serif';\"> :</span></p>\n" +
                        "<ol>\n" +
                        "<li><span style=\"font-family: 'Calibri','sans-serif';\">The candidate will be given 20 questions</span></li>\n" +
                        "<li><span style=\"font-family: 'Calibri','sans-serif';\">First 15 questions are of the form of fill in the blanks</span></li>\n" +
                        "<li><span style=\"font-family: 'Calibri','sans-serif';\">Last 5 questions are matching</span></li>\n" +
                        "<li><span style=\"font-family: 'Calibri','sans-serif';\">Time limit for each candidate is 15 minutes</span></li>\n" +
                        "</ol>" +
                        "\t\t<p>\n</p>" +
                        "\t\t<p>\n</p>" +
                        "\t\t<p>\n</p>" +
                        "\t\t\n\n\n\n\n  " ,
                R.drawable.synonym));
                events.add(new Event("Minute to Win it",
                " <p style=\"margin-top: 4.5pt;\"><strong><span style=\"font-size: 14.0pt; font-family: 'Calibri','sans-serif'; color: red;\">Staff Co-ordinator</span></strong><span style=\"font-size: 14.0pt; font-family: 'Calibri','sans-serif'; color: red;\">:</span></p>\n" +
                        "<p style=\"line-height: 13.6pt;\">L.N.Swamy Ph : 9032404380</p>\n" +
                        "<p style=\"line-height: 13.6pt;\"><span style=\"font-family: 'Calibri','sans-serif';\">&nbsp;</span></p>\n" +
                        "<p style=\"line-height: 13.6pt;\"><strong><span style=\"font-size: 14.0pt; font-family: 'Calibri','sans-serif'; color: red;\">Student Co-ordinator</span></strong><span style=\"font-size: 14.0pt; font-family: 'Calibri','sans-serif'; color: red;\">:</span></p>\n" +
                        "<p>D.Nikhitha sri Ph: 8008337492</p>\n" +
                        "<p>&nbsp;</p>\n" +
                        "<p><strong><span style=\"font-size: 14.0pt; font-family: 'Calibri','sans-serif'; color: red;\">Description :</span></strong></p>\n" +
                        "<p><span style=\"font-family: 'Calibri','sans-serif';\">Minute to win it helps the participant by challenging them to perform various challenges in C in just a minute. It consists of five unique rounds. It is a offline event. Each candidate has to perform single, and win the event. Top two members who completed the event within given&nbsp; time will be awarded.</span></p>\n" +
                        "<p><span style=\"font-family: 'Calibri','sans-serif';\">&nbsp;</span></p>\n" +
                        "<p><strong><span style=\"font-family: 'Calibri','sans-serif';\">Round 1 : Pick points</span></strong></p>\n" +
                        "<ol>\n" +
                        "<li><span style=\"font-family: 'Calibri','sans-serif';\">Here the candidate has to pick the papers related to C within a minute from a glass bowl</span></li>\n" +
                        "<li><span style=\"font-family: 'Calibri','sans-serif';\">Each candidate will be given 10 chances</span></li>\n" +
                        "<li><span style=\"font-family: 'Calibri','sans-serif';\">Each C paper you pick, gains to a point</span></li>\n" +
                        "<li><span style=\"font-family: 'Calibri','sans-serif';\">Candidates who have scored above 4 will be promoted to next round</span></li>\n" +
                        "</ol>\n" +
                        "<p><strong><span style=\"font-family: 'Calibri','sans-serif';\">&nbsp;</span></strong></p>\n" +
                        "<p><strong><span style=\"font-family: 'Calibri','sans-serif';\">Round 2 : Jumble letters</span></strong></p>\n" +
                        "<ol>\n" +
                        "<li><span style=\"font-family: 'Calibri','sans-serif';\">Here the candidate will be given 15 jumbled questions, you have to write down the correct word . Each word you solve will gain you a point</span></li>\n" +
                        "<li><span style=\"font-family: 'Calibri','sans-serif';\">Top 20 members will be promoted to next round</span></li>\n" +
                        "</ol>\n" +
                        "<p><strong><span style=\"font-family: 'Calibri','sans-serif';\">&nbsp;</span></strong></p>\n" +
                        "<p><strong><span style=\"font-family: 'Calibri','sans-serif';\">Round 3 :Fill the void</span></strong></p>\n" +
                        "<ol>\n" +
                        "<li><span style=\"font-family: 'Calibri','sans-serif';\">Here the candidate will be given 15 questions</span></li>\n" +
                        "<li><span style=\"font-family: 'Calibri','sans-serif';\">Top 10 members will be promoted to next round</span></li>\n" +
                        "</ol>\n" +
                        "<p><strong><span style=\"font-family: 'Calibri','sans-serif';\">&nbsp;</span></strong></p>\n" +
                        "<p><strong><span style=\"font-family: 'Calibri','sans-serif';\">Round 4 : Debugging</span></strong></p>\n" +
                        "<ol>\n" +
                        "<li><span style=\"font-family: 'Calibri','sans-serif';\">Here the candidate will be given single program which contain errors, the candidate has to deduce the errors</span></li>\n" +
                        "<li><span style=\"font-family: 'Calibri','sans-serif';\">5 members who has solved the program will be promoted to next round</span></li>\n" +
                        "</ol>\n" +
                        "<p><strong><span style=\"font-family: 'Calibri','sans-serif';\">Round 5 : Guess the result</span></strong></p>\n" +
                        "<ol>\n" +
                        "<li><span style=\"font-family: 'Calibri','sans-serif';\">Here the candidate will be given a C program, which he/she has to guess the output</span></li>\n" +
                        "</ol>" +
                        "\t\t<p>\n</p>" +
                        "\t\t<p>\n</p>" +
                        "\t\t<p>\n</p>" +
                        "\t\t\n\n\n\n\n  " ,
                R.drawable.minute));

            events.add(new Event("Technical Crossword puzzle",
                    "  <p style=\"margin-top: 4.5pt;\"><strong><span style=\"font-size: 14.0pt; font-family: 'Calibri','sans-serif'; color: red;\">Staff Co-ordinator</span></strong><span style=\"font-size: 14.0pt; font-family: 'Calibri','sans-serif'; color: red;\">:</span></p>\n" +
                            "<ol>\n" +
                            "<li><span style=\"font-family: 'Calibri','sans-serif';\">S. Phaniteja Ph : 9542099727</span></li>\n" +
                            "</ol>\n" +
                            "<p style=\"line-height: 13.6pt;\"><strong><span style=\"font-size: 14.0pt; font-family: 'Calibri','sans-serif'; color: red;\">Student Co-ordinator</span></strong><span style=\"font-size: 14.0pt; font-family: 'Calibri','sans-serif'; color: red;\">:</span></p>\n" +
                            "<ol>\n" +
                            "<li><span style=\"font-family: 'Calibri','sans-serif';\">Bhaskar Sai Varma Ph: 7997660066</span></li>\n" +
                            "<li><span style=\"font-family: 'Calibri','sans-serif';\">Satish Ph No-8096167552</span></li>\n" +
                            "</ol>\n" +
                            "<p><strong><span style=\"font-size: 14.0pt; font-family: 'Calibri','sans-serif'; color: red;\">Description :</span></strong></p>\n" +
                            "<p><span style=\"font-family: 'Calibri','sans-serif';\">Organized with two ROUNDS</span></p>\n" +
                            "<p><strong><span style=\"font-family: 'Calibri','sans-serif';\">Round 1 : </span></strong></p>\n" +
                            "<ol>\n" +
                            "<li><span style=\"font-family: 'Calibri','sans-serif';\">A puzzle with 15-20 questions is provided</span></li>\n" +
                            "<li><span style=\"font-family: 'Calibri','sans-serif';\">You are asked to answer them in 20 minutes of time</span></li>\n" +
                            "<li><span style=\"font-family: 'Calibri','sans-serif';\">1 mark for correct response</span></li>\n" +
                            "<li><span style=\"font-family: 'Calibri','sans-serif';\">Top 25 are selected for Round 2</span></li>\n" +
                            "</ol>\n" +
                            "<p><strong><span style=\"font-family: 'Calibri','sans-serif';\">Round 2 :</span></strong></p>\n" +
                            "<ol>\n" +
                            "<li><span style=\"font-family: 'Calibri','sans-serif';\">A Few questions are provided for word challenge</span></li>\n" +
                            "<li><span style=\"font-family: 'Calibri','sans-serif';\">Asked to answer them in 15 minutes of time</span></li>\n" +
                            "<li><span style=\"font-family: 'Calibri','sans-serif';\">2 marks for each approx correct response</span></li>\n" +
                            "</ol>" +
                            "\t\t<p>\n</p>" +
                            "\t\t<p>\n</p>" +
                            "\t\t<p>\n</p>" +
                            "\t\t\n\n\n\n\n  " ,
                    R.drawable.crossword));
            events.add(new Event("Electrical Animation",
                    "<p><span style=\"font-family: calibri, sans-serif; font-size: 12pt;\"><span style=\"color: #ff0000;\"><strong>CO-ORDINATOR</strong></span>:&nbsp;G.Nagaraju [89198139872]</span></p>\n" +
                            "<p><span style=\"font-family: calibri, sans-serif; font-size: 12pt;\"><strong>Number of Participants</strong>: 1</span></p>\n" +
                            "<p><span style=\"font-family: calibri, sans-serif; font-size: 12pt;\"><strong>Description</strong>:</span></p>\n" +
                            "<p><span style=\"font-family: calibri, sans-serif; font-size: 12pt;\">Create any electrical related concept animation video.</span></p>\n" +
                            "<p><span style=\"font-family: calibri, sans-serif; font-size: 12pt;\"><strong><u>Rules and Guidelines:</u></strong></span></p>\n" +
                            "<p>Time Limit: 10 minutes.</p>\n" +
                            "<p>Topics:&nbsp;</p>\n" +
                            "<ul>\n" +
                            "<li>Power Systems</li>\n" +
                            "<li>Electrical Machines</li>\n" +
                            "<li>Control Systems</li>\n" +
                            "<li>Power Electronics</li>\n" +
                            "<li>Green Energy</li>\n" +
                            "</ul>\n" +
                            "<p><span style=\"font-family: calibri, sans-serif; font-size: 12pt;\"><strong>Awarding criteria:</strong></span></p>\n" +
                            "<ul>\n" +
                            "<li><span style=\"font-family: calibri, sans-serif;\"><span style=\"font-size: 16px;\">Best Animated Video will be awarded</span></span></li>\n" +
                            "</ul>" +
                            "\t\t<p>\n</p>" +
                            "\t\t<p>\n</p>" +
                            "\t\t<p>\n</p>" +
                            "\t\t\n\n\n\n\n  " ,
                    R.drawable.animation));

            events.add(new Event("Flying Rockets",
                    " <p><strong class=\"text-danger\"><span style=\"color: #ff0000;\">Co-ordinator</span>: Mr. Srinivasa Rao , Ph:9966309124&nbsp;</strong></p>\n" +
                            "<p><br /><strong>Rules:</strong><br />Should be presented at the time of event.<br />Details will be explained at the venue.&nbsp;</p>" +
                            "\t\t<p>\n</p>" +
                            "\t\t<p>\n</p>" +
                            "\t\t<p>\n</p>" +
                            "\t\t\n\n\n\n\n  " ,
                    R.drawable.flying));
//            events.add(new Event("Clay Moulding",
//                    "\t<p>\n" +
//                            "                                            <strong>Event Coordinator: A.S.Nagaraju, Ph:9000323924</strong></p>\n" +
//                            "\t\t<ul>\n" +
//                            "" +
//                            " Open theme but you cannot bring any prints or cell phone pic . or a 3-d model. <br>\n" +
//                            "" +
//                            " you can use some add-ons like -ribbon ,feathers, sticks etc.. . <br>\n" +
//                            "" +
//                            " No colours . you are not allowed to colour the model in anyway <br>\n" +
//                            "" +
//                            " Bring newspaper to clean you table . <br>\n" +
//                            "" +
//                            " you will be given a fixed amount of clay and u can&#39;t bring your own clay from your side. <br>\n" +
//                            "" +
//                            " Registration fee is 100. <br>\n" +
//                            "\t\t</ul>\n" +
//                            "\t\t<p>\n" +
//                            "  Model must be a innovative </p>\n" +
//                            "\t\t<p>\n" +
//                            " Team shall consist of not more than 2 members. There can be multiple teams for the same college. </p>\n" +
//                            "<ul>\n" +
//                            "" +
//                            " Tell me if any non comps are coming. <br>\n" +
//                            "" +
//                            "Results declared by the judges will be final <br>\n" +
//                            "\t\t</ul>\n" +
//                            "\t\t<p>\n</p>" +
//                            "\t\t<p>\n</p>" +
//                            "\t\t<p>\n</p>" +
//                            "\t\t<p>\n</p>" +
//                            "\t\n\n\n\n\n\n\n" ,
//                    R.drawable.claymoulding));
//
//
//












//            events.add(new Event("Auto CAD",
//                    "" +
//                            "                                        <b class=\"text-danger\">Event Co-ordinator: Mr B Anup, Civil, Ph:8143182364 </b><br>\n" +
//                            "                                        <p> <b> Rules:</b><br>\n" +
//                            "                                        <p>Time limit: 1 hour</p> \n" +
//                            "                                        <p>Drawing:- Section, plan, elevation </p>\n" +
//                            "                                        <p>For Engineering and Diploma students.</p>",
//                    R.drawable.autocad));
//            events.add(new Event(
//                    " Mystery Busters  ",
//                    "   <p>Event Coordinators: CH.Saranya,D.Prasanth\n" +
//                            "                                        \n" +
//                            "                                        <p>\n" +
//                            "\t\t\tThe night is dark and full of terrors, so is the&nbsp; case. Solve the case, perform the tasks and find the Murderer.</p>\n" +
//                            "\t\t<p>\n" +
//                            "\t\t\t<span style=\"font-size:20px;\"><u><strong>Rules</strong></u></span></p>\n" +
//                            "\t\t<p>\n" +
//                            "\t\t\t1.&nbsp; Each team shall comprise of 4 participants only.</p>\n" +
//                            "\t\t<p>\n" +
//                            "\t\t\t2. Participants will have to solve cases with the help of clues and tasks</p>\n" +
//                            "\t\t<p>\n" +
//                            "\t\t\t3. No Team shall try to communicate with any other team or take any help form the volunteers.</p>\n" +
//                            "\t\t<p>\n" +
//                            "\t\t\t4. The event will be held within the college premises only.</p>\n" +
//                            "\t\t<p>\n" +
//                            "\t\t\t5. The decisions of Organizing committee will be final and binding.</p>\n" +
//                            "\t\t<p>\n" +
//                            "\t\t\t6. The management shall not be held responsible for any kind of injury caused in the course of the event.</p>\n" +
//                            "\t\t<p>\n" +
//                            "\t\t\t7. Use of expletives or aggressive behaviour will result i immediate disqualification.</p>\n" +
//                            "\t\t<p>\n" +
//                            "\t\t\t8. The participants are strictly advised not to disclose the name of their College/Institution to the Jury members/audience.</p>\n" +
//                            "\t\t<p>\n" +
//                            "\t\t\t9. The Organizing committee reserves the right to change the venue, time and rules, if desired&nbsp;</p>\n" +
//                            "\t\t ",
//                    R.drawable.mysterybuster
//            ));


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
