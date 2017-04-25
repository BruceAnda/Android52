package zhaoliang.com.android52.ui.day04.simplenewsclient.domain;

import java.util.List;

/**
 * Created by zhaoliang on 2017/4/25.
 */

public class NewsBean {

    /**
     * status : ok
     * source : abc-news-au
     * sortBy : top
     * articles : [{"author":null,"title":"Live: Gallipoli crowds mark Anzac Day after Australian, NZ dawn services","description":"Anzac Day events are underway in Turkey and France on the 102nd anniversary of the landing at Gallipoli. Stay across the commemorations in our live blog.","url":"http://www.abc.net.au/news/2017-04-25/anzac-day-2017-live-blog/8468162","urlToImage":"http://www.abc.net.au/news/image/8470126-1x1-700x700.jpg","publishedAt":"2017-04-25T02:49:45Z"},{"author":null,"title":"Security raised for Anzac Day services across the country","description":"Crowd numbers fall amid tightened security for Anzac Day commemorations around Australia.","url":"http://www.abc.net.au/news/2017-04-25/anzac-day-dawn-services-held-in-gallipoli-australia-new-zealand/8468178","urlToImage":"http://www.abc.net.au/news/image/8469568-1x1-700x700.jpg","publishedAt":"2017-04-25T01:58:38Z"},{"author":"http://www.abc.net.au/news/stephen-dziedzic/166934","title":"Turnbull visits troops in Iraq and Afghanistan","description":"The Prime Minister makes an Anzac Day-eve visit to Iraq and Afghanistan to meet serving troops and leaders of both war-torn countries.","url":"http://www.abc.net.au/news/2017-04-25/prime-minister-malcolm-turnbull-in-iraq-and-afghanistan/8469362","urlToImage":"http://www.abc.net.au/news/image/8469372-1x1-700x700.jpg","publishedAt":"2017-04-25T02:58:09Z"},{"author":"http://www.abc.net.au/news/jane-cowan/166896","title":"'No-one cares, mate': Being a war veteran at 27","description":"Chris May survived two missions to Afghanistan and being hit by an improvised explosive device. Then came the battle to fit back in to society.","url":"http://www.abc.net.au/news/2017-04-25/being-a-war-veteran-at-27/8467046","urlToImage":"http://www.abc.net.au/news/image/8469532-1x1-700x700.jpg","publishedAt":"2017-04-25T02:59:53Z"},{"author":"http://www.abc.net.au/news/louise-williams/31576","title":"'Returned to sender': Solving the mystery of a Great Escape POW's final hours","description":"Almost 73 years after a mother mailed a letter to her son John, who was a Prisoner of War under Nazi regime, a coincidence sees the envelope returned to the family.","url":"http://www.abc.net.au/news/2017-04-25/the-mystery-of-australian-pows-final-hours-in-nazi-germany/8465800","urlToImage":"http://www.abc.net.au/news/image/8466182-1x1-700x700.jpg","publishedAt":"2017-04-25T01:37:21Z"},{"author":"http://www.abc.net.au/news/steve-cannane/4823320","title":"Le Pen shocks by standing down as National Front leader","description":"Far-right presidential candidate Marine Le Pen shocks France by announcing she is stepping down as leader of her party.","url":"http://www.abc.net.au/news/2017-04-25/marine-le-pen-stands-down-from-national-front/8464796","urlToImage":"http://www.abc.net.au/news/image/8388724-1x1-700x700.jpg","publishedAt":"2017-04-24T23:09:25Z"},{"author":null,"title":"Trump says time to take off 'blindfolds'; calls for new North Korea sanctions","description":"Donald Trump says the UN must be prepared to impose new sanctions on North Korea.","url":"http://www.abc.net.au/news/2017-04-25/trump-calls-for-new-un-sanctions-against-north-korea/8469236","urlToImage":"http://www.abc.net.au/news/image/8469324-1x1-700x700.jpg","publishedAt":"2017-04-24T21:58:41Z"},{"author":null,"title":"Dutton wants apology from ABC over reporting of Manus shooting","description":"The Immigration Minister says the ABC should accept the Government's version of the events that took place during a shooting at the Manus Island detention centre on Good Friday.","url":"http://www.abc.net.au/news/2017-04-25/dutton-wants-apology-from-abc-over-reporting-of-manus-shooting/8469840","urlToImage":"http://www.abc.net.au/news/image/8428814-1x1-700x700.jpg","publishedAt":"2017-04-25T00:56:55Z"},{"author":"http://www.abc.net.au/news/bridget-brennan/167002","title":"'We thought we'd be treated differently': Indigenous soldiers still fighting for recognition","description":"This year, for the first time, Indigenous soldiers are leading the national Anzac Day march. Advocates say it is an overdue acknowledgement, after thousands were shunned by society.","url":"http://www.abc.net.au/news/2017-04-25/anzac-day-indigenous-soldiers-shunned-by-society/8468364","urlToImage":"http://www.abc.net.au/news/image/8468394-1x1-700x700.jpg","publishedAt":"2017-04-24T21:21:44Z"},{"author":"http://www.abc.net.au/news/david-coady/31644","title":"Convinced by his grandson, a WWII veteran is marching today in his first parade","description":"There will be a new face among the WWII veterans at Sydney's Anzac Day march, as John Craig joins the procession for the first time.","url":"http://www.abc.net.au/news/2017-04-25/a-wwii-veteran-is-marching-today-in-his-first-parade/8467770","urlToImage":"http://www.abc.net.au/news/image/8467964-1x1-700x700.jpg","publishedAt":"2017-04-25T01:38:30Z"}]
     */

    private String status;
    private String source;
    private String sortBy;
    private List<ArticlesBean> articles;

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getSource() {
        return source;
    }

    public void setSource(String source) {
        this.source = source;
    }

    public String getSortBy() {
        return sortBy;
    }

    public void setSortBy(String sortBy) {
        this.sortBy = sortBy;
    }

    public List<ArticlesBean> getArticles() {
        return articles;
    }

    public void setArticles(List<ArticlesBean> articles) {
        this.articles = articles;
    }

    public static class ArticlesBean {
        /**
         * author : null
         * title : Live: Gallipoli crowds mark Anzac Day after Australian, NZ dawn services
         * description : Anzac Day events are underway in Turkey and France on the 102nd anniversary of the landing at Gallipoli. Stay across the commemorations in our live blog.
         * url : http://www.abc.net.au/news/2017-04-25/anzac-day-2017-live-blog/8468162
         * urlToImage : http://www.abc.net.au/news/image/8470126-1x1-700x700.jpg
         * publishedAt : 2017-04-25T02:49:45Z
         */

        private Object author;
        private String title;
        private String description;
        private String url;
        private String urlToImage;
        private String publishedAt;

        public Object getAuthor() {
            return author;
        }

        public void setAuthor(Object author) {
            this.author = author;
        }

        public String getTitle() {
            return title;
        }

        public void setTitle(String title) {
            this.title = title;
        }

        public String getDescription() {
            return description;
        }

        public void setDescription(String description) {
            this.description = description;
        }

        public String getUrl() {
            return url;
        }

        public void setUrl(String url) {
            this.url = url;
        }

        public String getUrlToImage() {
            return urlToImage;
        }

        public void setUrlToImage(String urlToImage) {
            this.urlToImage = urlToImage;
        }

        public String getPublishedAt() {
            return publishedAt;
        }

        public void setPublishedAt(String publishedAt) {
            this.publishedAt = publishedAt;
        }
    }
}
