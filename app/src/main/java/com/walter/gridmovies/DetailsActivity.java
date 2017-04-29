package com.walter.gridmovies;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

public class DetailsActivity extends AppCompatActivity {
    ImageView imgPoster;
    TextView tvTitle, tvYear, tvDesc;

    int images[] ={R.mipmap.img_1,R.mipmap.img_2,R.mipmap.img_3,R.mipmap.img_4,R.mipmap.img_5,R.mipmap.img_6,R.mipmap.img_7,R.mipmap.img_8,R.mipmap.img_9,R.mipmap.img_10,R.mipmap.img_11,R.mipmap.img_12,R.mipmap.img_13,R.mipmap.img_14,R.mipmap.img_15,R.mipmap.img_16,R.mipmap.img_17,R.mipmap.img_18,R.mipmap.img_19,R.mipmap.img_20};

    /*==========================================ARRAY OF SHORT SYNOPSYS FOR EACH MOVIE=======================================================*/
    String[] desc ={"Two imprisoned men bond over a number of years, finding solace and eventual redemption through acts of common decency. ","The aging patriarch of an organized crime dynasty transfers control of his clandestine empire to his reluctant son ","When the menace known as the Joker wreaks havoc and chaos on the people of Gotham, the Dark Knight must come to terms with one of the greatest psychological tests of his ability to fight injustice. ","A jury holdout attempts to prevent a miscarriage of justice by forcing his colleagues to reconsider the evidence. ","In German-occupied Poland during World War II, Oskar Schindler gradually becomes concerned for his Jewish workforce after witnessing their persecution by the Nazi Germans. ","Gandalf and Aragorn lead the World of Men against Sauron's army to draw his gaze from Frodo and Sam as they approach Mount Doom with the One Ring. ","A bounty hunting scam joins two men in an uneasy alliance against a third in a race to find a fortune in gold buried in a remote cemetery. ","An insomniac office worker, looking for a way to change his life, crosses paths with a devil-may-care soap maker, forming an underground fight club that evolves into something much, much more. ","A meek Hobbit from the Shire and eight companions set out on a journey to destroy the powerful One Ring and save Middle Earth from the Dark Lord Sauron. ","While not intelligent, Forrest Gump has accidentally been present at many historic moments, but his true love, Jenny Curran, eludes him. ","After the rebels have been brutally overpowered by the Empire on their newly established base, Luke Skywalker takes advanced Jedi training with Master Yoda, while his friends are pursued by Darth Vader as part of his plan to capture Luke. ","A thief, who steals corporate secrets through use of dream-sharing technology, is given the inverse task of planting an idea into the mind of a CEO. ","While Frodo and Sam edge closer to Mordor with the help of the shifty Gollum, the divided fellowship makes a stand against Sauron's new ally, Saruman, and his hordes of Isengard. ","Henry Hill and his friends work their way up through the mob hierarchy. ","A computer hacker learns from mysterious rebels about the true nature of his reality and his role in the war against its controllers. ","A poor village under attack by bandits recruits seven unemployed samurai to help them defend themselves. ","When an open-minded Jewish librarian and his son become victims of the Holocaust, he uses a perfect mixture of will, humor and imagination to protect his son from the dangers around their camp. ","from the Empire's world-destroying battle-station, while also attempting to rescue Princess Leia from the evil Darth Vader. ","Two detectives, a rookie and a veteran, hunt a serial killer who uses the seven deadly sins as his modus operandi. ","A young F.B.I. cadet must confide in an incarcerated and manipulative killer to receive his help on catching another serial killer who skins his victims. "};

    /*==========================================ARRAY OF  YEARS RELEASED FOR EACH MOVIE=======================================================*/
    String[] years ={"1994 ","1972 ","2008 ","1957 ","1993 ","2003 ","1966 ","1999 ","2001 ","1994 ","1980 ","2010 ","2002 ","1990 ","1999 ","1954 ","1997 ","1977 ","1995 ","1991 ","2002 "};

    /*===============================================ARRAY OF  TITLE FOR EACH MOVIE==================================================*/

    String[] titles ={"The Shawshank Redemption ","The Godfather ","The Dark Knight ","12 Angry Men ","Schindler's List ","The Lord of the Rings: The Return of the King ","The Good, the Bad and the Ugly ","Fight Club ","Forrest Gump ","Star Wars: Episode V - The Empire Strikes Back ","Inception ","The Lord of the Rings: The Two Towers ","Goodfellas ","The Matrix ","Seven Samurai ","Life Is Beautiful ","Star Wars: Episode IV - A New Hope ","Se7en ","The Silence of the Lambs ","City of God "};



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_details);
        imgPoster = (ImageView) findViewById(R.id.ivPoster);
        tvTitle = (TextView) findViewById(R.id.tvTitle);
        tvYear = (TextView) findViewById(R.id.tvYear);
        tvDesc = (TextView) findViewById(R.id.tvDesc);

        int position = getIntent().getIntExtra("data",0);
        imgPoster.setImageResource(images[position]);
        tvTitle.setText(titles[position]);
        tvYear.setText(years[position]);
        tvDesc.setText(desc[position]);


    }
}
