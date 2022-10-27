package com.realy.realytest

import android.os.Bundle
import android.widget.Toast
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import com.realy.realytest.card.Card
import com.realy.realytest.ui.theme.RealyTestTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val list = listOf<Pair<String, String>>(
            Pair("title1", "Lorem ipsum dolor sit amet "),
            Pair(
                "The standard Lorem Ipsum passage, used since the 1500s\n",
                "Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua. Ut enim ad minim veniam, quis nostrud exercitation ullamco laboris nisi ut aliquip ex ea commodo consequat. Duis aute irure dolor in reprehenderit in voluptate velit esse cillum dolore eu fugiat nulla pariatur. Excepteur sint occaecat cupidatat non proident, sunt in culpa qui officia deserunt mollit anim id est laborum"
            ),
            Pair(
                "1914 translation by H. Rackham",
                "But I must explain to you how all this mistaken idea of denouncing pleasure and praising pain was born and I will give you a complete account of the system, and expound the actual teachings of the great explorer of the truth, the master-builder of human happiness. No one rejects, dislikes, or avoids pleasure itself, because it is pleasure, but because those who do not know how to pursue pleasure rationally encounter consequences that are extremely painful. Nor again is there anyone who loves or pursues or desires to obtain pain of itself, because it is pain, but because occasionally circumstances occur in which toil and pain can procure him some great pleasure. To take a trivial example, which of us ever undertakes laborious physical exercise, except to obtain some advantage from it? But who has any right to find fault with a man who chooses to enjoy a pleasure that has no annoying consequences, or one who avoids a pain that produces no resultant pleasure?"
            ),
            Pair(
                "1914 translation by H. Rackham",
                "On the other hand, we denounce with righteous indignation and dislike men who are so beguiled and demoralized by the charms of pleasure of the moment, so blinded by desire, that they cannot foresee the pain and trouble that are bound to ensue; and equal blame belongs to those who fail in their duty through weakness of will, which is the same as saying through shrinking from toil and pain. These cases are perfectly simple and easy to distinguish. In a free hour, when our power of choice is untrammelled and when nothing prevents our being able to do what we like best, every pleasure is to be welcomed and every pain avoided. But in certain circumstances and owing to the claims of duty or the obligations of business it will frequently occur that pleasures have to be repudiated and annoyances accepted. The wise man therefore always holds in these matters to this principle of selection: he rejects pleasures to secure other greater pleasures, or else he endures pains to avoid worse pains.\"\n" +
                        "\n "
            ),
            Pair(
                "मानक Lorem Ipsum अनुच्छेद, सन 1500 से इस्तेमाल में\n",
                "Lorem Ipsum का मानक हिस्सा जिसकी प्रतिलिपि सन 1500 से प्रयोग की जाती है, रुचि रखने वालों के लिए नीचे उपलब्ध है. Cicero द्वारा लिखे गए \"de Finibus Bonorum et Malorum\" के खंड 1.10.32 और 1.10.3 भी अपने सटीक मूल रूप में उत्पादित हैं, साथ ही H. Rackham द्वारा 1914 में अंग्रेजी में अनुवादित संस्करण.\n" +
                        "\n "
            ),
        )
        setContent {
            RealyTestTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colors.background
                ) {
                    LazyColumn(modifier = Modifier.fillMaxSize()) {
                        list.forEach {
                            item {
                                Row(
                                    modifier = Modifier
                                        .fillMaxWidth()
                                        .wrapContentHeight().padding(10.dp)
                                ) {
                                    Card(
                                        title = it.first,
                                        desc = it.second,
                                        modifier = Modifier
                                            .fillMaxWidth()
                                            .wrapContentHeight(),
                                        onJokeClick = {
                                            Toast.makeText(this@MainActivity, it.first, Toast.LENGTH_SHORT).show()
                                        })
                                }

                            }
                        }
                    }
                }
            }
        }
    }
}

