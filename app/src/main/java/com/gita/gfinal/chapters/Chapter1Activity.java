package com.gita.gfinal.chapters;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.GridView;

import com.gita.gfinal.Adaptor;
import com.gita.gfinal.R;

import java.util.ArrayList;

public class Chapter1Activity extends AppCompatActivity {

    Adaptor adaptor;
    ArrayList<String> list;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_chapter1);

        list = new ArrayList<>();
        list.add("CHAPTER 1, VERSE 1\n" +
                "\n" +
                "\n" +
                "धृतराष्ट्र उवाच |\n" +
                "धर्मक्षेत्रे कुरुक्षेत्रे समवेता युयुत्सवः |\n" +
                "मामकाः पाण्डवाश्चैव किमकुर्वत सञ्जय ॥1॥\n" +
                "\n" +
                "\n" +
                "Transliteration\n" +
                "\n" +
                "dhṛitarāśhtra uvācha\n" +
                "dharma-kṣhetre kuru-kṣhetre samavetā yuyutsavaḥ\n" +
                "māmakāḥ pāṇḍavāśhchaiva kimakurvata sañjaya\n" +
                "\n" +
                "\n" +
                "Word Meanings\n" +
                "\n" +
                "dhṛitarāśhtraḥ uvācha—Dhritarashtra said; dharma-kṣhetre—the land of dharma; kuru-kṣhetre—at Kurukshetra; samavetāḥ—having gathered; yuyutsavaḥ—desiring to fight; māmakāḥ—my sons; pāṇḍavāḥ—the sons of Pandu; cha—and; eva—certainly; kim—what; akurvata—did they do; sañjaya—Sanjay\n" +
                "\n" +
                "\n" +
                "Translation\n" +
                "\n" +
                "\n" +
                "Dhritarastra said: O Sanjaya, what did my sons and the sons of Pandu actually do when, eager for battle, they gathered together on the holy field of Kuruksetra?");

        list.add("CHAPTER 1, VERSE 2" +
                "\n" +
                "\n" +
                "सञ्जय उवाच ।\n" +
                "दृष्ट्वा तु पाण्डवानीकं व्यूढं दुर्योधनस्तदा ।\n" +
                "आचार्यमुपसङ्गम्य राजा वचनमब्रवीत् ॥2॥\n" +
                "\n" +
                "\n" +
                "Transliteration\n" +
                "\n" +
                "sañjaya uvācha\n" +
                "dṛiṣhṭvā tu pāṇḍavānīkaṁ vyūḍhaṁ duryodhanastadā\n" +
                "āchāryamupasaṅgamya rājā vachanamabravīt\n" +
                "\n" +
                "\n" +
                "Word Meanings\n" +
                "\n" +
                "sanjayaḥ uvācha—Sanjay said; dṛiṣhṭvā—on observing; tu—but; pāṇḍava-anīkam—the Pandava army; vyūḍham—standing in a military formation; duryodhanaḥ—King Duryodhan; tadā—then; āchāryam—teacher; upasaṅgamya—approached; rājā—the king; vachanam—words; abravīt—spoke\n" +
                "\n" +
                "\n" +
                "Translation\n" +
                "\n" +
                "\n" +
                "Sanjaya said: But then, seeing the army of the Pandavas in battle array, King Duryodhana approached his teacher (Dronacharya) and spoke the following words:");
        list.add("CHAPTER 1, VERSE 3" +
                "\n" +
                "\n" +
                "पश्यैतां पाण्डुपुत्राणामाचार्य महतीं चमूम् ।\n" +
                "व्यूढां द्रुपदपुत्रेण तव शिष्येण धीमता ॥3॥\n" +
                "\n" +
                "\n" +
                "Transliteration\n" +
                "\n" +
                "paśhyaitāṁ pāṇḍu-putrāṇām āchārya mahatīṁ chamūm\n" +
                "vyūḍhāṁ drupada-putreṇa tava śhiṣhyeṇa dhīmatā\n" +
                "\n" +
                "\n" +
                "Word Meanings\n" +
                "\n" +
                "paśhya—behold; etām—this; pāṇḍu-putrāṇām—of the sons of Pandu; āchārya—respected teacher; mahatīm—mighty; chamūm—army; vyūḍhām—arrayed in a military formation; drupada-putreṇa—son of Drupad, Dhrishtadyumna; tava—by your; śhiṣhyeṇa—disciple; dhī-matā—intelligent\n" +
                "\n" +
                "\n" +
                "Translation\n" +
                "\n" +
                "\n" +
                "O teacher, (please) see this vast army of the sons of Pandu, arrayed for battle by the son of Drupada, your intelligent disciple, Dhrishtadyumna.");
        list.add("CHAPTER 1, VERSE 4" +
                "\n" +
                "\n" +
                "अत्र शूरा महेष्वासा भीमार्जुनसमा युधि |\n" +
                "युयुधानो विराटश्च द्रुपदश्च महारथ: ॥4॥\n" +
                "\n" +
                "\n" +
                "Transliteration\n" +
                "\n" +
                "atra śhūrā maheṣhvāsā bhīmārjuna-samā yudhi\n" +
                "yuyudhāno virāṭaśhcha drupadaśhcha mahā-rathaḥ\n" +
                "\n" +
                "\n" +
                "Word Meanings\n" +
                "\n" +
                "atra—here; śhūrāḥ—powerful warriors; mahā-iṣhu-āsāḥ—great bowmen; bhīma-arjuna-samāḥ—equal to Bheem and Arjun; yudhi—in military prowess; yuyudhānaḥ—Yuyudhan; virāṭaḥ—Virat; cha—and; drupadaḥ—Drupad; cha—also; mahā-rathaḥ—warriors who could single handedly match the strength of ten thousand ordinary warriors;\n" +
                "\n" +
                "\n" +
                "Translation\n" +
                "\n" +
                "\n" +
                "There are in this army, heroes wielding great bows, and equal in military prowess to Bhima and Arjuna: Yuyudhana (Satyaki) and Virata, and the maharatha (great chariot-rider) Drupada;");
        list.add("CHAPTER 1, VERSE 5" +
                "");
        list.add("CHAPTER 1, VERSE 6" +
                "");
        list.add("CHAPTER 1, VERSE 7" +
                "");
        list.add("CHAPTER 1, VERSE 8" +
                "");
        list.add("CHAPTER 1, VERSE 9" +
                "");
        list.add("CHAPTER 1, VERSE 10" +
                "");
        list.add("CHAPTER 1, VERSE 11" +
                "");
        list.add("CHAPTER 1, VERSE 12" +
                "");
        list.add("CHAPTER 1, VERSE 13" +
                "");
        list.add("CHAPTER 1, VERSE 14" +
                "");
        list.add("CHAPTER 1, VERSE 15" +
                "");
        list.add("CHAPTER 1, VERSE 16" +
                "");
        list.add("CHAPTER 1, VERSE 17" +
                "");
        list.add("CHAPTER 1, VERSE 18" +
                "");
        list.add("CHAPTER 1, VERSE 19" +
                "");
        list.add("CHAPTER 1, VERSE 20" +
                "");
        list.add("CHAPTER 1, VERSE 21" +
                "");
        list.add("CHAPTER 1, VERSE 22" +
                "");
        list.add("CHAPTER 1, VERSE 23" +
                "");
        list.add("CHAPTER 1, VERSE 24" +
                "");
        list.add("CHAPTER 1, VERSE 25" +
                "");
        list.add("CHAPTER 1, VERSE 26" +
                "");
        list.add("CHAPTER 1, VERSE 27" +
                "");
        list.add("CHAPTER 1, VERSE 28" +
                "");
        list.add("CHAPTER 1, VERSE 29" +
                "");
        list.add("CHAPTER 1, VERSE 30" +
                "");
        list.add("CHAPTER 1, VERSE 31" +
                "");
        list.add("CHAPTER 1, VERSE 32" +
                "");
        list.add("CHAPTER 1, VERSE 33" +
                "");
        list.add("CHAPTER 1, VERSE 34" +
                "");
        list.add("CHAPTER 1, VERSE 35" +
                "");
        list.add("CHAPTER 1, VERSE 36" +
                "");
        list.add("CHAPTER 1, VERSE 37" +
                "");
        list.add("CHAPTER 1, VERSE 38" +
                "");
        list.add("CHAPTER 1, VERSE 39" +
                "");
        list.add("CHAPTER 1, VERSE 40" +
                "");

        GridView mGridView = findViewById(R.id.gridview);
        adaptor = new Adaptor(list,this);
        mGridView.setAdapter(adaptor);

    }
}