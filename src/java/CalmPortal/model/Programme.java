
package CalmPortal.model;

/**
 *
 * @author tuanjinn
 */
public class Programme {
    private int programmeId;
    private String title;
    private String shortDescription;
    private String description;
    private String fullText;

    public Programme(int programmeId, String title, String shortDescription, String description) {
        this.programmeId = programmeId;
        this.title = title;
        this.shortDescription = shortDescription;
        this.description = "Modern life is full of hassles, deadlines, frustrations, and demands. For many people, stress is so commonplace that it has become a way of life. Stress isn’t always bad. In small doses, it can help you perform under pressure and motivate you to do your best. But when you’re constantly running in emergency mode, your mind and body pay the price. You can protect yourself by recognizing the signs and symptoms of stress and taking steps to reduce its harmful effects";
        this.fullText = "The kids need a ride to school, your husband can't find his shorts, your boss has just scheduled an online meeting, and your best friend desperately needs your help -- all at the same time.\n" +
"\n" +
"Is it any wonder that you can't find a minute for relaxation? In fact, if you're like most women, you may have even forgotten how to relax.\n" +
"\n" +
"And though experts say that some stress is good for you -- it can sharpen your senses and your mind -- too much stress is bad for your mental and physical health. At the same time, relaxation can do wonders to restore balance in your life -- and may even reduce some of the health risks associated with stress.\n" +
"\n" +
"<h2>1. Meditate</h2>\n" +
"\n" +
"If you're thinking meditation means twisting your body into an uncomfortable position and uttering \"oohs\" and \"omms\" for an hour, guess again. Any repetitive action can be a source of meditation, says Herbert Benson, MD, author of The Relaxation Response and director emeritus of Benson-Henry Institute for Mind Body Medicine in Chestnut Hill, Mass. This includes walking, swimming, painting, knitting -- any activity that helps keep your attention calmly in the present moment.\n" +
"\n" +
"When you catch yourself thinking about your job, your relationship or your lifelong to-do list, experts say to simply let the thought escape, and bring your mind back the repetition of the activity. Try it for just 5 to 10 minutes a day and watch stress levels drop.\n" +
"\n" +
"<h2>2. Picture Yourself Relaxed</h2>\n" +
"\n" +
"Is your mind too talkative to meditate? Try creating a peaceful visualization, or \"dreamscape.\" To start, simply visualize anything that keeps your thoughts away from current tensions. It could be a favorite vacation spot, a fantasy island, that penthouse in New York City -- or something \"touchable,\" like the feel of your favorite silk robe or cozy sweater.\n" +
"\n" +
"The idea is to take your mind off your stress, and replace it with an image that evokes a sense of calm. The more realistic your daydream -- in terms of colors, sights, sounds; even touch and feel -- the more relaxation you'll experience.\n" +
"\n" +
"<h2>3. Breathe Deeply</h2>\n" +
"\n" +
"Feeling stressed evokes tense, shallow breathing, while calm is associated with relaxed breathing, says Michael Lee, author of Turn Stress into Bliss and founder of Phoenix Rising Yoga Therapy in Bristol, Vermont. So to turn tension into relaxation, he says, change the way you breathe.\n" +
"\n" +
"Try this: Let out a big sigh, dropping your chest, and exhaling through gently pursed lips, says Joan Borysenko, PhD, director of Harvard's Mind-Body Clinical Programs. Now imagine your low belly, or center, as a deep, powerful place. Feel your breath coming and going as your mind stays focused there. Inhale, feeling your entire belly, sides and lower back expand. Exhale, sighing again as you drop your chest, and feeling your belly, back and sides contract. Repeat 10 times, relaxing more fully each time.";
    }
    
    

    public int getProgrammeId() {
        return programmeId;
    }

    public void setProgrammeId(int programmeId) {
        this.programmeId = programmeId;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getShortDescription() {
        return shortDescription;
    }

    public void setShortDescription(String shortDescription) {
        this.shortDescription = shortDescription;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getFullText() {
        return fullText;
    }

    public void setFullText(String fullText) {
        this.fullText = fullText;
    }

    
    
   
    
    
}
