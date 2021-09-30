package com.gita.gfinal.chapters;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.os.Bundle;
import android.widget.Toast;

import com.gita.gfinal.R;
import com.ramotion.paperonboarding.PaperOnboardingEngine;
import com.ramotion.paperonboarding.PaperOnboardingPage;
import com.ramotion.paperonboarding.listeners.PaperOnboardingOnChangeListener;
import com.ramotion.paperonboarding.listeners.PaperOnboardingOnRightOutListener;

import java.util.ArrayList;

public class Chapter2Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_chapter2);

        PaperOnboardingEngine engine = new PaperOnboardingEngine(findViewById(R.id.onboardingRootView2), getDataForOnboarding(), getApplicationContext());

        engine.setOnChangeListener(new PaperOnboardingOnChangeListener() {
            @Override
            public void onPageChanged(int oldElementIndex, int newElementIndex) {
                //Toast.makeText(getApplicationContext(), "Verse no. " + (oldElementIndex + 1) + " to " + (newElementIndex + 1) + " verse", Toast.LENGTH_SHORT).show();
            }
        });

        engine.setOnRightOutListener(new PaperOnboardingOnRightOutListener() {
            @Override
            public void onRightOut() {
                // Probably here will be your exit action
                Toast.makeText(getApplicationContext(), "Chapter ended", Toast.LENGTH_SHORT).show();
            }
        });

    }

    private ArrayList<PaperOnboardingPage> getDataForOnboarding() {
        // prepare data
        PaperOnboardingPage scr1 = new PaperOnboardingPage("VERSE 1",
                "धृतराष्ट्र उवाच |\n" +
                        "धर्मक्षेत्रे कुरुक्षेत्रे समवेता युयुत्सवः |\n" +
                        "मामकाः पाण्डवाश्चैव किमकुर्वत सञ्जय ॥1॥\n"+
                        "\n" +
                        "Transliteration\n" +
                        "dhṛitarāśhtra uvācha\n" +
                        "dharma-kṣhetre kuru-kṣhetre samavetā yuyutsavaḥ\n" +
                        "māmakāḥ pāṇḍavāśhchaiva kimakurvata sañjaya\n" +
                        "\n"+
                        "Translation\n" +
                        "Dhritarastra said: O Sanjaya, what did my sons and the sons of " +
                        "Pandu actually do when, eager for battle, they gathered together on the holy field of Kuruksetra?",
                Color.parseColor("#678FB4"), R.drawable.img2, R.drawable.ic_num);
        PaperOnboardingPage scr2 = new PaperOnboardingPage("VERSE 2",
                "सञ्जय उवाच ।\n" +
                        "दृष्ट्वा तु पाण्डवानीकं व्यूढं दुर्योधनस्तदा ।\n" +
                        "आचार्यमुपसङ्गम्य राजा वचनमब्रवीत् ॥2॥\n"+
                        "\n"+
                        "Transliteration\n" +
                        "sañjaya uvācha\n" +
                        "dṛiṣhṭvā tu pāṇḍavānīkaṁ vyūḍhaṁ duryodhanastadā\n" +
                        "āchāryamupasaṅgamya rājā vachanamabravīt\n" +
                        "\n"+
                        "Translation\n" +
                        "Sanjaya said: But then, seeing the army of the Pandavas in battle array, " +
                        "King Duryodhana approached his teacher (Dronacharya) and spoke the following words:",
                Color.parseColor("#65B0B4"), R.drawable.img2, R.drawable.ic_num);
        PaperOnboardingPage scr3 = new PaperOnboardingPage("VERSE 3",
                "\n" +
                        "पश्यैतां पाण्डुपुत्राणामाचार्य महतीं चमूम् ।\n" +
                        "व्यूढां द्रुपदपुत्रेण तव शिष्येण धीमता ॥3॥\n"+
                        "\n" +
                        "Transliteration\n" +
                        "paśhyaitāṁ pāṇḍu-putrāṇām āchārya mahatīṁ chamūm\n" +
                        "vyūḍhāṁ drupada-putreṇa tava śhiṣhyeṇa dhīmatā\n" +
                        "\n" +
                        "Translation\n" +
                        "O teacher, (please) see this vast army of the sons of Pandu, arrayed for " +
                        "battle by the son of Drupada, your intelligent disciple, Dhrishtadyumna.",
                Color.parseColor("#9B90BC"), R.drawable.img2, R.drawable.ic_num);

        PaperOnboardingPage scr4 = new PaperOnboardingPage("VERSE 4",
                "अत्र शूरा महेष्वासा भीमार्जुनसमा युधि |\n" +
                        "युयुधानो विराटश्च द्रुपदश्च महारथ: ॥4॥\n"+
                        "\n" +
                        "Transliteration\n" +
                        "atra śhūrā maheṣhvāsā bhīmārjuna-samā yudhi\n" +
                        "yuyudhāno virāṭaśhcha drupadaśhcha mahā-rathaḥ\n" +
                        "\n" +
                        "Translation\n" +
                        "There are in this army, heroes wielding great bows, and equal in military prowess" +
                        " to Bhima and Arjuna: Yuyudhana (Satyaki) and Virata, and the maharatha (great chariot-rider) Drupada;",
                Color.parseColor("#678FB4"), R.drawable.img2, R.drawable.ic_num);
        PaperOnboardingPage scr5 = new PaperOnboardingPage("VERSE 5",
                "धृष्टकेतुश्चेकितान: काशिराजश्च वीर्यवान् |\n" +
                        "पुरुजित्कुन्तिभोजश्च शैयश्च नरपुङ्गव: ॥5॥\n" +
                        "युधामन्युश्च विक्रान्त उत्तमौजाश्च वीर्यवान् |\n"+
                        "\n" +
                        "Transliteration\n" +
                        "dhṛiṣhṭaketuśhchekitānaḥ kāśhirājaśhcha vīryavān\n" +
                        "purujit kuntibhojaśhcha śhaibyaśhcha nara-puṅgavaḥ\n" +
                        "yudhāmanyuśhcha vikrānta uttamaujāśhcha vīryavān\n" +
                        "\n" +
                        "Translation\n" +
                        "Dhrstaketu, Cekitana, and the valiant king of Kasi (Varanasi); Purujit and Kuntibhoja," +
                        " and Saibya, the choicest among men;",
                Color.parseColor("#65B0B4"), R.drawable.img2, R.drawable.ic_num);
        PaperOnboardingPage scr6 = new PaperOnboardingPage("VERSE 6",
                "सौभद्रो द्रौपदेयाश्च सर्व एव महारथा: ॥6॥\n" +
                        "\n" +
                        "Transliteration\n" +
                        "saubhadro draupadeyāśhcha sarva eva mahā-rathāḥ\n" +
                        "\n" +
                        "Translation\n" +
                        "And the chivalrous Yudhamanyu, and the valiant Uttamaujas; son of Subhadra" +
                        " (Abhimanyu) and the sons of Draupadi all (of whom) are, verily, maharathas.",
                Color.parseColor("#9B90BC"), R.drawable.img2, R.drawable.ic_num);
        PaperOnboardingPage scr7 = new PaperOnboardingPage("VERSE 7",
                "अस्माकं तु विशिष्टा ये तान्निबोध द्विजोत्तम |\n" +
                        "नायका मम सैन्यस्य संज्ञार्थं तान्ब्रवीमि ते ॥7॥\n" +
                        "\n" +
                        "Transliteration\n" +
                        "asmākaṁ tu viśhiṣhṭā ye tānnibodha dwijottama\n" +
                        "nāyakā mama sainyasya sanjñārthaṁ tānbravīmi te\n" +
                        "\n" +
                        "Translation\n" +
                        "But, O best among the Brahmanas, please be appraised of those who are foremost among us, " +
                        "the principal warriors of my army. I speak of them to you by way of example.",
                Color.parseColor("#65B0B4"), R.drawable.img2, R.drawable.ic_num);
        PaperOnboardingPage scr8 = new PaperOnboardingPage("VERSE 8",
                " भवान्भीष्मश्च कर्णश्च कृपश्च समितिञ्जय: |\n" +
                        "अश्वत्थामा विकर्णश्च सौमदत्तिस्तथैव च ॥8॥\n" +
                        "\n" +
                        "Transliteration\n" +
                        "bhavānbhīṣhmaśhcha karṇaśhcha kṛipaśhcha samitiñjayaḥ\n" +
                        "aśhvatthāmā vikarṇaśhcha saumadattis tathaiva cha\n" +
                        "\n" +
                        "Translation\n" +
                        "(They are:) Your venerable self, Bhisma and Karna, and Krpa who is ever victorious in battle; " +
                        "Asvatthama, Vikarna, Saumadatti and Jayadratha.",
                Color.parseColor("#9B90BC"), R.drawable.img2, R.drawable.ic_num);
        PaperOnboardingPage scr9 = new PaperOnboardingPage("VERSE 9",
                "अन्ये च बहव: शूरा मदर्थे त्यक्तजीविता: |\n" +
                        "नानाशस्त्रप्रहरणा: सर्वे युद्धविशारदा: ॥9॥\n" +
                        "\n" +
                        "Transliteration\n" +
                        "anye cha bahavaḥ śhūrā madarthe tyaktajīvitāḥ\n" +
                        "nānā-śhastra-praharaṇāḥ sarve yuddha-viśhāradāḥ\n" +
                        "\n" +
                        "Translation\n" +
                        "There are many heroes who have dedicated their lives for my sake," +
                        " who possess various kinds of weapons and missiles," +
                        " (and) all of whom are skilled in battle.",
                Color.parseColor("#65B0B4"), R.drawable.img2, R.drawable.ic_num);
        PaperOnboardingPage scr10 = new PaperOnboardingPage("VERSE 10",
                "अपर्याप्तं तदस्माकं बलं भीष्माभिरक्षितम् |\n" +
                        "पर्याप्तं त्विदमेतेषां बलं भीमाभिरक्षितम् ॥10॥\n" +
                        "\n" +
                        "Transliteration\n" +
                        "aparyāptaṁ tadasmākaṁ balaṁ bhīṣhmābhirakṣhitam\n" +
                        "paryāptaṁ tvidameteṣhāṁ balaṁ bhīmābhirakṣhitam\n" +
                        "\n" +
                        "Translation\n" +
                        "Therefore, our army under the complete protection of Bhisma and others is unlimited. " +
                        "But the army of these (enemies), under the protection of Bhima and others is limited.",
                Color.parseColor("#9B90BC"), R.drawable.img2, R.drawable.ic_num);
        PaperOnboardingPage scr11 = new PaperOnboardingPage("VERSE 11",
                "अयनेषु च सर्वेषु यथाभागमवस्थिता: |\n" +
                        "भीष्ममेवाभिरक्षन्तु भवन्त: सर्व एव हि ॥11॥\n" +
                        "\n" +
                        "Transliteration\n" +
                        "ayaneṣhu cha sarveṣhu yathā-bhāgamavasthitāḥ\n" +
                        "bhīṣhmamevābhirakṣhantu bhavantaḥ sarva eva hi\n" +
                        "\n" +
                        "Translation\n" +
                        "However, venerable sirs, all of you without exception, while occupying all the positions in the" +
                        " different directions as allotted (to you respectively), please fully protect Bhisma in particular.",
                Color.parseColor("#65B0B4"), R.drawable.img2, R.drawable.ic_num);
        PaperOnboardingPage scr12 = new PaperOnboardingPage("VERSE 12",
                "तस्य सञ्जनयन्हर्षं कुरुवृद्ध: पितामह: |\n" +
                        "सिंहनादं विनद्योच्चै: शङ्खं दध्मौ प्रतापवान् ॥12॥\n" +
                        "\n" +
                        "Transliteration\n" +
                        "tasya sañjanayan harṣhaṁ kuru-vṛiddhaḥ pitāmahaḥ\n" +
                        "siṁha-nādaṁ vinadyochchaiḥ śhaṅkhaṁ dadhmau pratāpavān\n" +
                        "\n" +
                        "Translation\n" +
                        "The valiant grandfather, the eldest of the Kurus, loudly sounding a lion-roar, " +
                        "blew the conch to raise his (Duryodhana's) spirits.",
                Color.parseColor("#9B90BC"), R.drawable.img2, R.drawable.ic_num);
        PaperOnboardingPage scr13 = new PaperOnboardingPage("VERSE 13",
                "तत: शङ्खाश्च भेर्यश्च पणवानकगोमुखा: |\n" +
                        "सहसैवाभ्यहन्यन्त स शब्दस्तुमुलोऽभवत् ॥13॥\n" +
                        "\n" +
                        "Transliteration\n" +
                        "tataḥ śhaṅkhāśhcha bheryaśhcha paṇavānaka-gomukhāḥ\n" +
                        "sahasaivābhyahanyanta sa śhabdastumulo ’bhavat\n" +
                        "\n" +
                        "Translation\n" +
                        "Just immediately after that conchs and kettledrums, and tabors, " +
                        "trumpets and cow-horns blared forth. That sound became tumultuous.",
                Color.parseColor("#65B0B4"), R.drawable.img2, R.drawable.ic_num);
        PaperOnboardingPage scr14 = new PaperOnboardingPage("VERSE 14",
                "तत: श्वेतैर्हयैर्युक्ते महति स्यन्दने स्थितौ |\n" +
                        "माधव: पाण्डवश्चैव दिव्यौ शङ्खौ प्रदध्मतु: ॥14॥\n" +
                        "\n" +
                        "Transliteration\n" +
                        "tataḥ śhvetairhayairyukte mahati syandane sthitau\n" +
                        "mādhavaḥ pāṇḍavaśhchaiva divyau śhaṅkhau pradadhmatuḥ\n" +
                        "\n" +
                        "Translation\n" +
                        "\n" +
                        "Then, Madhava (Krishna) and the son of Pandu (Arjuna), stationed in their magnificent chariot " +
                        "with white horses attached to it, loudly blew their divine conchs.",
                Color.parseColor("#9B90BC"), R.drawable.img2, R.drawable.ic_num);
        PaperOnboardingPage scr15 = new PaperOnboardingPage("VERSE 15",
                "पाञ्चजन्यं हृषीकेशो देवदत्तं धनञ्जय: |\n" +
                        "पौण्ड्रं दध्मौ महाशङ्खं भीमकर्मा वृकोदर: ॥15॥\n" +
                        "\n" +
                        "Transliteration\n" +
                        "pāñchajanyaṁ hṛiṣhīkeśho devadattaṁ dhanañjayaḥ\n" +
                        "pauṇḍraṁ dadhmau mahā-śhaṅkhaṁ bhīma-karmā vṛikodaraḥ\n" +
                        "\n" +
                        "Translation\n" +
                        "Hrsikesa (Krishna) blew the conch Pancajanya; Dhananjaya (Arjuna) (the conch) Devadatta; and " +
                        "Vrkodara (Bhima) of terrible deeds blew the great conch Paundra;",
                Color.parseColor("#65B0B4"), R.drawable.img2, R.drawable.ic_num);
        PaperOnboardingPage scr16 = new PaperOnboardingPage("VERSE 16",
                "अनन्तविजयं राजा कुन्तीपुत्रो युधिष्ठिर: |\n" +
                        "नकुल: सहदेवश्च सुघोषमणिपुष्पकौ ॥16॥\n" +
                        "\n" +
                        "Transliteration\n" +
                        "anantavijayaṁ rājā kuntī-putro yudhiṣhṭhiraḥ\n" +
                        "nakulaḥ sahadevaśhcha sughoṣha-maṇipuṣhpakau\n" +
                        "\n" +
                        "Translation\n" +
                        "King Yudhisthira, son of Kunti, (blew) the Anantavijaya; Nakula and Sahadeva, " +
                        "the Sughosa and the Manipuspaka (respectively).",
                Color.parseColor("#9B90BC"), R.drawable.img2, R.drawable.ic_num);
        PaperOnboardingPage scr17 = new PaperOnboardingPage("VERSE 17",
                "काश्यश्च परमेष्वास: शिखण्डी च महारथ: |\n" +
                        "धृष्टद्युम्नो विराटश्च सात्यकिश्चापराजित: ॥17॥\n" +
                        "\n" +
                        "Transliteration\n" +
                        "kāśhyaśhcha parameṣhvāsaḥ śhikhaṇḍī cha mahā-rathaḥ\n" +
                        "dhṛiṣhṭadyumno virāṭaśhcha sātyakiśh chāparājitaḥ\n" +
                        "\n" +
                        "Translation\n" +
                        "And the King of Kasi, wielding a great bow, and the great chariot-rider Sikhandi, " +
                        "Dhrstadyumna and Virata, and Satyaki the unconquered;",
                Color.parseColor("#65B0B4"), R.drawable.img2, R.drawable.ic_num);
        PaperOnboardingPage scr18 = new PaperOnboardingPage("VERSE 18",
                "द्रुपदो द्रौपदेयाश्च सर्वश: पृथिवीपते |\n" +
                        "सौभद्रश्च महाबाहु: शङ्खान्दध्मु: पृथक् पृथक् ॥18॥\n" +
                        "\n" +
                        "Transliteration\n" +
                        "drupado draupadeyāśhcha sarvaśhaḥ pṛithivī-pate\n" +
                        "saubhadraśhcha mahā-bāhuḥ śhaṅkhāndadhmuḥ pṛithak pṛithak\n" +
                        "\n" +
                        "Translation\n" +
                        "Drupada and the sons of Draupadi, and the son of Subhadra, (Abhimanyu) the mighty-armed all" +
                        " (of them) together, O king, blew their respective conchs.",
                Color.parseColor("#9B90BC"), R.drawable.img2, R.drawable.ic_num);
        PaperOnboardingPage scr19 = new PaperOnboardingPage("VERSE 19",
                "स घोषो धार्तराष्ट्राणां हृदयानि व्यदारयत् |\n" +
                        "नभश्च पृथिवीं चैव तुमुलो नुनादयन् ॥19॥\n" +
                        "\n" +
                        "Transliteration\n" +
                        "sa ghoṣho dhārtarāṣhṭrāṇāṁ hṛidayāni vyadārayat\n" +
                        "nabhaśhcha pṛithivīṁ chaiva tumulo nunādayan\n" +
                        "\n" +
                        "Translation\n" +
                        "That tremendous sound pierced the hearts of the sons of Dhrtarastra as it reverberated through the sky and the earth.",
                Color.parseColor("#65B0B4"), R.drawable.img2, R.drawable.ic_num);
        PaperOnboardingPage scr20 = new PaperOnboardingPage("VERSE 20",
                "अथ व्यवस्थितान्दृष्ट्वा धार्तराष्ट्रान् कपिध्वज: |\n" +
                        "प्रवृत्ते शस्त्रसम्पाते धनुरुद्यम्य पाण्डव: ॥20॥\n" +
                        "हृषीकेशं तदा वाक्यमिदमाह महीपते |\n" +
                        "\n" +
                        "Transliteration\n" +
                        "atha vyavasthitān dṛiṣhṭvā dhārtarāṣhṭrān kapi-dhwajaḥ\n" +
                        "pravṛitte śhastra-sampāte dhanurudyamya pāṇḍavaḥ\n" +
                        "hṛiṣhīkeśhaṁ tadā vākyam idam āha mahī-pate\n" +
                        "\n" +
                        "Translation\n" +
                        "O king,thereafter,seeing Dhrtarastra's men standing in their positions," +
                        "when all the weapons were ready for action, the son of Pandu (Arjuna) who had the insignia of " +
                        "Hanuman on his chariot-flag,raising up his bow, said the following to Hrsikesa",
                Color.parseColor("#9B90BC"), R.drawable.img2, R.drawable.ic_num);
        PaperOnboardingPage scr21 = new PaperOnboardingPage("VERSE 21",
                "अर्जुन उवाच |\n" +
                        "सेनयोरुभयोर्मध्ये रथं स्थापय मेऽच्युत ॥21॥\n" +
                        "\n" +
                        "Transliteration\n" +
                        "arjuna uvācha\n" +
                        "senayor ubhayor madhye rathaṁ sthāpaya me ’chyuta\n" +
                        "\n" +
                        "Translation\n" +
                        "Arjuna said: O Acyuta, please place my chariot between both the armies.",
                Color.parseColor("#65B0B4"), R.drawable.img2, R.drawable.ic_num);
        PaperOnboardingPage scr22 = new PaperOnboardingPage("VERSE 22",
                "यावदेतान्निरीक्षेऽहं योद्धुकामानवस्थितान् |\n" +
                        "कैर्मया सह योद्धव्यमस्मिन् रणसमुद्यमे ॥22॥\n" +
                        "\n" +
                        "Transliteration\n" +
                        "yāvadetān nirīkṣhe ’haṁ yoddhu-kāmān avasthitān\n" +
                        "kairmayā saha yoddhavyam asmin raṇa-samudyame\n" +
                        "\n" +
                        "Translation\n" +
                        "And keep it there until I survey these who stand intent on fighting, " +
                        "and those who are going to engage in battle with me in this impending war.",
                Color.parseColor("#9B90BC"), R.drawable.img2, R.drawable.ic_num);
        PaperOnboardingPage scr23 = new PaperOnboardingPage("VERSE 23",
                "योत्स्यमानानवेक्षेऽहं य एतेऽत्र समागता: |\n" +
                        "धार्तराष्ट्रस्य दुर्बुद्धेर्युद्धे प्रियचिकीर्षव: ॥23॥\n" +
                        "\n" +
                        "Transliteration\n" +
                        "yotsyamānān avekṣhe ’haṁ ya ete ’tra samāgatāḥ\n" +
                        "dhārtarāṣhṭrasya durbuddher yuddhe priya-chikīrṣhavaḥ\n" +
                        "\n" +
                        "Translation\n" +
                        "These who have assembled here and want to accomplish in the war what is dear to " +
                        "the perverted son of Dhrtarastra, I find them to be intent on fighting.",
                Color.parseColor("#65B0B4"), R.drawable.img2, R.drawable.ic_num);
        PaperOnboardingPage scr24 = new PaperOnboardingPage("VERSE 24",
                "सञ्जय उवाच |\n" +
                        "एवमुक्तो हृषीकेशो गुडाकेशेन भारत |\n" +
                        "सेनयोरुभयोर्मध्ये स्थापयित्वा रथोत्तमम् ॥24॥\n" +
                        "\n" +
                        "Transliteration\n" +
                        "sañjaya uvācha\n" +
                        "evam ukto hṛiṣhīkeśho guḍākeśhena bhārata\n" +
                        "senayor ubhayor madhye sthāpayitvā rathottamam\n" +
                        "\n" +
                        "Translation\n" +
                        "Sanjay said: O scion of the line of Bharata (Dhrtararastra), Hrsikesa, being told so by Gudakesa (Arjuna)," +
                        "placed the excellent chariot between the two armies.",
                Color.parseColor("#9B90BC"), R.drawable.img2, R.drawable.ic_num);
        PaperOnboardingPage scr25 = new PaperOnboardingPage("VERSE 25",
                "भीष्मद्रोणप्रमुखत: सर्वेषां च महीक्षिताम् |\n" +
                        "उवाच पार्थ पश्यैतान्समवेतान्कुरूनिति ॥25॥\n" +
                        "\n" +
                        "Transliteration\n" +
                        "bhīṣhma-droṇa-pramukhataḥ sarveṣhāṁ cha mahī-kṣhitām\n" +
                        "uvācha pārtha paśhyaitān samavetān kurūn iti\n" +
                        "\n" +
                        "Translation\n" +
                        "In front of Bhisma and Drona as also all the rulers of the earth, and said," +
                        " 'O Partha (Arjuna), see these assembled people of the Kuru dynasty.'",
                Color.parseColor("#65B0B4"), R.drawable.img2, R.drawable.ic_num);
        PaperOnboardingPage scr26 = new PaperOnboardingPage("VERSE 26",
                "तत्रापश्यत्स्थितान् पार्थ: पितृ नथ पितामहान् |\n" +
                        "आचार्यान्मातुलान्भ्रातृ न्पुत्रान्पौत्रान्सखींस्तथा ॥26॥\n" +
                        "श्वशुरान्सुहृदश्चैव सेनयोरुभयोरपि |\n" +
                        "\n" +
                        "Transliteration\n" +
                        "tatrāpaśhyat sthitān pārthaḥ pitṝīn atha pitāmahān\n" +
                        "āchāryān mātulān bhrātṝīn putrān pautrān sakhīṁs tathā\n" +
                        "śhvaśhurān suhṛidaśh chaiva senayor ubhayor api\n" +
                        "\n" +
                        "Translation\n" +
                        "Then Partha (Arjuna) saw, marshalled among both the armies, (his) uncles as also grandfathers, teachers," +
                        " maternal uncles, brothers (and (cousins), sons, grandsons, as well as comrades and fathers-in-law and friends.",
                Color.parseColor("#9B90BC"), R.drawable.img2, R.drawable.ic_num);
        PaperOnboardingPage scr27 = new PaperOnboardingPage("VERSE 27",
                "तान्समीक्ष्य स कौन्तेय: सर्वान्बन्धूनवस्थितान् ॥27॥\n" +
                        "कृपया परयाविष्टो विषीदन्निदमब्रवीत् |\n" +
                        "\n" +
                        "Transliteration\n" +
                        "tān samīkṣhya sa kaunteyaḥ sarvān bandhūn avasthitān\n" +
                        "kṛipayā parayāviṣhṭo viṣhīdann idam abravīt\n" +
                        "\n" +
                        "Translation\n" +
                        "The son of Kunti (Ajuna), seeing all those relatives arrayed (there)," +
                        " became overwhelmed by supreme compassion and said this sorrowfully:",
                Color.parseColor("#65B0B4"), R.drawable.img2, R.drawable.ic_num);
        PaperOnboardingPage scr28 = new PaperOnboardingPage("VERSE 28",
                "अर्जुन उवाच |\n" +
                        "दृष्ट्वेमं स्वजनं कृष्ण युयुत्सुं समुपस्थितम् ॥28॥\n" +
                        "\n" +
                        "Transliteration\n" +
                        "arjuna uvācha\n" +
                        "dṛiṣhṭvemaṁ sva-janaṁ kṛiṣhṇa yuyutsuṁ samupasthitam\n" +
                        "\n" +
                        "Translation\n" +
                        "Arjuna said: O Krsna, seeing these relatives and friends who have assembled here with the intention of fighting," +
                        " my limbs give way and my mouth becomes completely dry.",
                Color.parseColor("#9B90BC"), R.drawable.img2, R.drawable.ic_num);
        PaperOnboardingPage scr29 = new PaperOnboardingPage("VERSE 29",
                "सीदन्ति मम गात्राणि मुखं च परिशुष्यति |\n" +
                        "वेपथुश्च शरीरे मे रोमहर्षश्च जायते ॥29॥\n" +
                        "\n" +
                        "Transliteration\n" +
                        "sīdanti mama gātrāṇi mukhaṁ cha pariśhuṣhyati\n" +
                        "vepathuśh cha śharīre me roma-harṣhaśh cha jāyate\n" +
                        "\n" +
                        "Translation\n" +
                        "And there is trembling in my body, and there are cold shivers; the Gandiva (bow) " +
                        "slips from the hand and even the skin burns intensely.",
                Color.parseColor("#65B0B4"), R.drawable.img2, R.drawable.ic_num);
        PaperOnboardingPage scr30 = new PaperOnboardingPage("VERSE 30",
                "गाण्डीवं स्रंसते हस्तात्वक्चै व परिदह्यते |\n" +
                        "न च शक्नोम्यवस्थातुं भ्रमतीव च मे मन: ॥30॥\n" +
                        "\n" +
                        "Transliteration\n" +
                        "gāṇḍīvaṁ sraṁsate hastāt tvak chaiva paridahyate\n" +
                        "na cha śhaknomy avasthātuṁ bhramatīva cha me manaḥ\n" +
                        "\n" +
                        "Translation\n" +
                        "Moreover, O Kesava (Krsna), I am not able to stand firmly, and my mind seems to be whirling. " +
                        "And I notice the omens to be adverse",
                Color.parseColor("#9B90BC"), R.drawable.img2, R.drawable.ic_num);
        PaperOnboardingPage scr31 = new PaperOnboardingPage("VERSE 31",
                "निमित्तानि च पश्यामि विपरीतानि केशव |\n" +
                        "न च श्रेयोऽनुपश्यामि हत्वा स्वजनमाहवे ॥31॥\n" +
                        "\n" +
                        "Transliteration\n" +
                        "nimittāni cha paśhyāmi viparītāni keśhava\n" +
                        "na cha śhreyo ’nupaśhyāmi hatvā sva-janam āhave\n" +
                        "\n" +
                        "Translation\n" +
                        "Besides, I do not see any good (to be derived) from killing my own people in battle. O Krsna," +
                        " I do not desire victory, nor even a kingdom nor pleasures.",
                Color.parseColor("#65B0B4"), R.drawable.img2, R.drawable.ic_num);
        PaperOnboardingPage scr32 = new PaperOnboardingPage("VERSE 32",
                "न काङ्क्षे विजयं कृष्ण न च राज्यं सुखानि च |\n" +
                        "किं नो राज्येन गोविन्द किं भोगैर्जीवितेन वा ॥32॥\n" +
                        "\n" +
                        "Transliteration\n" +
                        "na kāṅkṣhe vijayaṁ kṛiṣhṇa na cha rājyaṁ sukhāni cha\n" +
                        "kiṁ no rājyena govinda kiṁ bhogair jīvitena vā\n" +
                        "\n" +
                        "Translation\n" +
                        "I desire not victory, O Krishna, nor kingdom, nor pleasures. Of what avail is dominion to us, O Krishna, or pleasures or even life?",
                Color.parseColor("#9B90BC"), R.drawable.img2, R.drawable.ic_num);
        PaperOnboardingPage scr33 = new PaperOnboardingPage("VERSE 33",
                "येषामर्थे काङ्क्षितं नो राज्यं भोगा: सुखानि च |\n" +
                        "त इमेऽवस्थिता युद्धे प्राणांस्त्यक्त्वा धनानि च ॥33॥\n" +
                        "\n" +
                        "Transliteration\n" +
                        "yeṣhām arthe kāṅkṣhitaṁ no rājyaṁ bhogāḥ sukhāni cha\n" +
                        "ta ime ’vasthitā yuddhe prāṇāṁs tyaktvā dhanāni cha\n" +
                        "\n" +
                        "Translation\n" +
                        "Those for whose sake we desire kingdom, enjoyments and pleasures, stand here in battle, having renounced life and wealth",
                Color.parseColor("#65B0B4"), R.drawable.img2, R.drawable.ic_num);
        PaperOnboardingPage scr34 = new PaperOnboardingPage("VERSE 34",
                "आचार्या: पितर: पुत्रास्तथैव च पितामहा: |\n" +
                        "मातुला: श्वशुरा: पौत्रा: श्याला: सम्बन्धिनस्तथा ॥34॥\n" +
                        "\n" +
                        "Transliteration\n" +
                        "āchāryāḥ pitaraḥ putrās tathaiva cha pitāmahāḥ\n" +
                        "mātulāḥ śhvaśhurāḥ pautrāḥ śhyālāḥ sambandhinas tathā\n" +
                        "\n" +
                        "Translation\n" +
                        "Teachers, fathers, sons and also grandfathers, maternal uncles, fathers-in-law, grandsons, brothers-in-law and other relatives.",
                Color.parseColor("#9B90BC"), R.drawable.img2, R.drawable.ic_num);
        PaperOnboardingPage scr35 = new PaperOnboardingPage("VERSE 35",
                "एतान्न हन्तुमिच्छामि घ्नतोऽपि मधुसूदन |\n" +
                        "अपि त्रैलोक्यराज्यस्य हेतो: किं नु महीकृते ॥35॥\n" +
                        "\n" +
                        "Transliteration\n" +
                        "etān na hantum ichchhāmi ghnato ’pi madhusūdana\n" +
                        "api trailokya-rājyasya hetoḥ kiṁ nu mahī-kṛite\n" +
                        "\n" +
                        "Translation\n" +
                        "O Madhusudana, even if I am killed, I do not want to kill these even for the sake of a kingdom " +
                        "extending over the three worlds; what to speak of doing so for the earth!",
                Color.parseColor("#65B0B4"), R.drawable.img2, R.drawable.ic_num);
        PaperOnboardingPage scr36 = new PaperOnboardingPage("VERSE 36",
                "निहत्य धार्तराष्ट्रान्न: का प्रीति: स्याज्जनार्दन |\n" +
                        "पापमेवाश्रयेदस्मान्हत्वैतानाततायिन: || 36 ||\n" +
                        "\n" +
                        "Transliteration\n" +
                        "nihatya dhārtarāṣhṭrān naḥ kā prītiḥ syāj janārdana\n" +
                        "pāpam evāśhrayed asmān hatvaitān ātatāyinaḥ\n" +
                        "\n" +
                        "Translation\n" +
                        "O Janardana, what happiness shall we derive by killing the sons of Dhrtarastra? Sin alone will accrue to us by killing these felons.",
                Color.parseColor("#9B90BC"), R.drawable.img2, R.drawable.ic_num);
        PaperOnboardingPage scr37 = new PaperOnboardingPage("VERSE 37",
                "तस्मान्नार्हा वयं हन्तुं धार्तराष्ट्रान्स्वबान्धवान् |\n" +
                        "स्वजनं हि कथं हत्वा सुखिन: स्याम माधव ॥37॥\n" +
                        "\n" +
                        "Transliteration\n" +
                        "tasmān nārhā vayaṁ hantuṁ dhārtarāṣhṭrān sa-bāndhavān\n" +
                        "sva-janaṁ hi kathaṁ hatvā sukhinaḥ syāma mādhava\n" +
                        "\n" +
                        "Translation\n" +
                        "Therefore, it is not proper for us to kill the sons of Dhrtarastra who are our own relatives. " +
                        "For, O Madhava, how can we be happy by killing our kinsmen?",
                Color.parseColor("#65B0B4"), R.drawable.img2, R.drawable.ic_num);
        PaperOnboardingPage scr38 = new PaperOnboardingPage("VERSE 38",
                "यद्यप्येते न पश्यन्ति लोभोपहतचेतस: |\n" +
                        "कुलक्षयकृतं दोषं मित्रद्रोहे च पातकम् ॥38॥\n" +
                        "\n" +
                        "Transliteration\n" +
                        "yady apy ete na paśhyanti lobhopahata-chetasaḥ\n" +
                        "kula-kṣhaya-kṛitaṁ doṣhaṁ mitra-drohe cha pātakam\n" +
                        "\n" +
                        "Translation\n" +
                        "O Janardana, although these people, whose hearts have become perverted by greed, " +
                        "do not see the evil arising from destroying the family and sin in hostility towards, friends,",
                Color.parseColor("#9B90BC"), R.drawable.img2, R.drawable.ic_num);
        PaperOnboardingPage scr39 = new PaperOnboardingPage("VERSE 39",
                "कथं न ज्ञेयमस्माभि: पापादस्मान्निवर्तितुम् |\n" +
                        "कुलक्षयकृतं दोषं प्रपश्यद्भिर्जनार्दन ॥39॥\n" +
                        "\n" +
                        "Transliteration\n" +
                        "kathaṁ na jñeyam asmābhiḥ pāpād asmān nivartitum\n" +
                        "kula-kṣhaya-kṛitaṁ doṣhaṁ prapaśhyadbhir janārdana\n" +
                        "\n" +
                        "Translation\n" +
                        "yet how can we who clearly see the evil arising from destroying the family remain " +
                        "unaware of (the need of) abstaining from this sin?",
                Color.parseColor("#65B0B4"), R.drawable.img2, R.drawable.ic_num);
        PaperOnboardingPage scr40 = new PaperOnboardingPage("VERSE 40",
                "कुलक्षये प्रणश्यन्ति कुलधर्मा: सनातना: |\n" +
                        "धर्मे नष्टे कुलं कृत्स्नमधर्मोऽभिभवत्युत ॥40॥\n" +
                        "\n" +
                        "Transliteration\n" +
                        "\n" +
                        "kula-kṣhaye praṇaśhyanti kula-dharmāḥ sanātanāḥ\n" +
                        "dharme naṣhṭe kulaṁ kṛitsnam adharmo ’bhibhavaty uta\n" +
                        "\n" +
                        "Translation\n" +
                        "From the ruin of the family are totally destroyed the traditional rites and duties of the family." +
                        " When rites and duties are destroyed, vice overpowers the entire family also.",
                Color.parseColor("#9B90BC"), R.drawable.img2, R.drawable.ic_num);
        PaperOnboardingPage scr41 = new PaperOnboardingPage("VERSE 41",
                "अधर्माभिभवात्कृष्ण प्रदुष्यन्ति कुलस्त्रिय: |\n" +
                        "स्त्रीषु दुष्टासु वार्ष्णेय जायते वर्णसङ्कर: ॥41॥\n" +
                        "\n" +
                        "Transliteration\n" +
                        "adharmābhibhavāt kṛiṣhṇa praduṣhyanti kula-striyaḥ\n" +
                        "strīṣhu duṣhṭāsu vārṣhṇeya jāyate varṇa-saṅkaraḥ\n" +
                        "\n" +
                        "Translation\n" +
                        "O Krsna, when vice predominates, the women of the family become corrupt. O descendent of the Vrsnis, " +
                        "when women become corrupted, it results in the intermingling of castes.",
                Color.parseColor("#65B0B4"), R.drawable.img2, R.drawable.ic_num);
        PaperOnboardingPage scr42 = new PaperOnboardingPage("VERSE 42",
                "सङ्करो नरकायैव कुलघ्नानां कुलस्य च |\n" +
                        "पतन्ति पितरो ह्येषां लुप्तपिण्डोदकक्रिया: ॥42॥\n" +
                        "\n" +
                        "Transliteration\n" +
                        "saṅkaro narakāyaiva kula-ghnānāṁ kulasya cha\n" +
                        "patanti pitaro hy eṣhāṁ lupta-piṇḍodaka-kriyāḥ\n" +
                        "\n" +
                        "Translation\n" +
                        "And the intermingling in the family leads the ruiners of the family verily into hell. " +
                        "The forefathers of these fall down (into hell) because of being deprived of the offerings of rice-balls and water.",
                Color.parseColor("#9B90BC"), R.drawable.img2, R.drawable.ic_num);
        PaperOnboardingPage scr43 = new PaperOnboardingPage("VERSE 43",
                "दोषैरेतै: कुलघ्नानां वर्णसङ्करकारकै: |\n" +
                        "उत्साद्यन्ते जातिधर्मा: कुलधर्माश्च शाश्वता: ॥43॥\n" +
                        "\n" +
                        "Transliteration\n" +
                        "doṣhair etaiḥ kula-ghnānāṁ varṇa-saṅkara-kārakaiḥ\n" +
                        "utsādyante jāti-dharmāḥ kula-dharmāśh cha śhāśhvatāḥ\n" +
                        "\n" +
                        "Translation\n" +
                        "Due to these misdeeds of the ruiners of the family, which cause intermingling of castes, " +
                        "the traditional rites and duties of the castes and families become destroyed.",
                Color.parseColor("#65B0B4"), R.drawable.img2, R.drawable.ic_num);
        PaperOnboardingPage scr44 = new PaperOnboardingPage("VERSE 44",
                "उत्सन्नकुलधर्माणां मनुष्याणां जनार्दन |\n" +
                        "नरकेऽनियतं वासो भवतीत्यनुशुश्रुम ॥44॥\n" +
                        "\n" +
                        "Transliteration\n" +
                        "utsanna-kula-dharmāṇāṁ manuṣhyāṇāṁ janārdana\n" +
                        "narake ‘niyataṁ vāso bhavatītyanuśhuśhruma\n" +
                        "\n" +
                        "Translation\n" +
                        "O Janardana, we have heard that living in hell becomes inevitable for those persons whose family duties get destroyed.",
                Color.parseColor("#9B90BC"), R.drawable.img2, R.drawable.ic_num);
        PaperOnboardingPage scr45 = new PaperOnboardingPage("VERSE 45",
                "अहो बत महत्पापं कर्तुं व्यवसिता वयम् |\n" +
                        "यद्राज्यसुखलोभेन हन्तुं स्वजनमुद्यता: ॥45॥\n" +
                        "\n" +
                        "Transliteration\n" +
                        "aho bata mahat pāpaṁ kartuṁ vyavasitā vayam\n" +
                        "yad rājya-sukha-lobhena hantuṁ sva-janam udyatāḥ\n" +
                        "\n" +
                        "Translation\n" +
                        "What a pity that we have resolved to commit a great sin by being eager to kill our own " +
                        "kith and kin, out of greed for the pleasures of a kingdom!",
                Color.parseColor("#65B0B4"), R.drawable.img2, R.drawable.ic_num);
        PaperOnboardingPage scr46 = new PaperOnboardingPage("VERSE 46",
                "यदि मामप्रतीकारमशस्त्रं शस्त्रपाणय: |\n" +
                        "धार्तराष्ट्रा रणे हन्युस्तन्मे क्षेमतरं भवेत् ॥46॥\n" +
                        "\n" +
                        "Transliteration\n" +
                        "yadi mām apratīkāram aśhastraṁ śhastra-pāṇayaḥ\n" +
                        "dhārtarāṣhṭrā raṇe hanyus tan me kṣhemataraṁ bhavet\n" +
                        "\n" +
                        "Translation\n" +
                        "If, in this battle, the sons of Dhrtarastra armed with weapons kill me who " +
                        "am non-resistant and unarmed, that will be more beneficial to me.",
                Color.parseColor("#9B90BC"), R.drawable.img2, R.drawable.ic_num);
        PaperOnboardingPage scr47 = new PaperOnboardingPage("VERSE 47",
                "सञ्जय उवाच |\n" +
                        "एवमुक्त्वार्जुन: सङ्ख्ये रथोपस्थ उपाविशत् |\n" +
                        "विसृज्य सशरं चापं शोकसंविग्नमानस: ॥47॥\n" +
                        "\n" +
                        "Transliteration\n" +
                        "sañjaya uvācha\n" +
                        "evam uktvārjunaḥ saṅkhye rathopastha upāviśhat\n" +
                        "visṛijya sa-śharaṁ chāpaṁ śhoka-saṁvigna-mānasaḥ\n" +
                        "\n" +
                        "Translation\n" +
                        "Sanjaya narrated: Having said so, Arjuna, with a mind afflicted with sorrow, " +
                        "sat down on the chariot in the midst of the battle, casting aside the bow along with the arrows.",
                Color.parseColor("#65B0B4"), R.drawable.img2, R.drawable.ic_num);




        ArrayList<PaperOnboardingPage> elements = new ArrayList<>();
        elements.add(scr1);
        elements.add(scr2);
        elements.add(scr3);
        elements.add(scr4);
        elements.add(scr5);
        elements.add(scr6);
        elements.add(scr7);
        elements.add(scr8);
        elements.add(scr9);
        elements.add(scr10);
        elements.add(scr11);
        elements.add(scr12);
        elements.add(scr13);
        elements.add(scr14);
        elements.add(scr15);
        elements.add(scr16);
        elements.add(scr17);
        elements.add(scr18);
        elements.add(scr19);
        elements.add(scr20);
        elements.add(scr21);
        elements.add(scr22);
        elements.add(scr23);
        elements.add(scr24);
        elements.add(scr25);
        elements.add(scr26);
        elements.add(scr27);
        elements.add(scr28);
        elements.add(scr29);
        elements.add(scr30);
        elements.add(scr31);
        elements.add(scr32);
        elements.add(scr32);
        elements.add(scr33);
        elements.add(scr34);
        elements.add(scr35);
        elements.add(scr36);
        elements.add(scr37);
        elements.add(scr38);
        elements.add(scr39);
        elements.add(scr40);
        elements.add(scr41);
        elements.add(scr42);
        elements.add(scr43);
        elements.add(scr44);
        elements.add(scr45);
        elements.add(scr46);
        elements.add(scr47);
        return elements;
    }
}