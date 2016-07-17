package io.github.lumue.infojson;

import org.junit.Assert;
import org.junit.Test;

import java.io.ByteArrayInputStream;
import java.io.InputStream;
import java.nio.charset.StandardCharsets;


/**
 * test nfo serialization of a movie entity
 */
public class DownloadMetadataStreamParserTest {

	private final static String YOUTUBE_SAMPLE_JSON = "{\"upload_date\": \"20140511\", \"creator\": null, \"height\": 720, \"like_count\": 464, \"duration\": 5777, \"fulltitle\": \"\\u2605 Galaxis Milchstrasse \\u2605 HD \\u2605 Universedokus\", \"playlist_index\": null, \"view_count\": 179455, \"playlist\": null, \"title\": \"\\u2605 Galaxis Milchstrasse \\u2605 HD \\u2605 Universedokus\", \"_filename\": \"\\u2605 Galaxis Milchstrasse \\u2605 HD \\u2605 Universedokus.f247+140.webm\", \"tags\": [\"kosmos\", \"komische kreise\", \"kreise\", \"all\", \"Universe (Quotation Subject)\", \"Black Hole (Literature Subject)\", \"Kosmos\", \"Schwarzes Loch\", \"Supernova\", \"Hypernova\", \"Doku\", \"Dokumentation\", \"Universum\", \"Neutronenstern\", \"Ereignishorizont\", \"Gravitation\", \"Urknall\", \"Planeten\", \"Deutsch\", \"Komet\", \"Meteorit\", \"Meteor\", \"Mond\", \"Sonne\", \"Pluto\", \"Saturn\", \"Jupiter\", \"Moon\", \"Pulsar\", \"quasar\", \"Zenit\", \"terra\", \"nova\", \"Neptune (Astrology)\", \"Ufo\", \"Alien\", \"Space\", \"Discovery HD\", \"Mars (Astrology)\", \"Exploration (Taxonomy Subject)\", \"mars rover\", \"mars\", \"Jupiter (Business Operation)\", \"Earth\", \"Zeit\"], \"is_live\": null, \"id\": \"f2eVjaUi4aw\", \"dislike_count\": 23, \"average_rating\": 4.81108808517, \"abr\": 128, \"uploader_url\": \"http://www.youtube.com/channel/UCy9nKg7GmzmzUYetLS8lIog\", \"categories\": [\"Science & Technology\"], \"fps\": 1, \"stretched_ratio\": null, \"age_limit\": 0, \"annotations\": null, \"webpage_url_basename\": \"watch\", \"acodec\": \"mp4a.40.2\", \"display_id\": \"f2eVjaUi4aw\", \"automatic_captions\": {}, \"description\": \"Die Milchstrasse - Unsere Heimat im Universum ist ein Animationskurzfilm. Als Dokumentation aufbereitet dient er als Unterrichtsmaterial f\\u00fcr den Astronomieunterricht in Lehrinstituten wie Sekundarschulen und Gymnasien zwischen 8. und 10. Klasse. Der Film erl\\u00e4utert in knapp sieben Minuten die spannensten und wichtigsten Fakten \\u00fcber unsere eigene Galaxis - Die Milchstrasse in der wir leben. Dabei werden viele Fakten nicht einfach nur erz\\u00e4hlt sondern in verst\\u00e4ndlichen Vergleichen visualisiert. Eingeteilt ist der Film in vier Kategorien die sich mit generellen Begriffen und Definitionen \\u00fcber die Galaxis besch\\u00e4ftigen, sowie die Sterne und ihre unterschiedlichen Todesarten. Der letzte Teil handelt von der Menschheit in der Milchstrasse und anderen m\\u00f6glichen Zivilisationen. Insgesamt werden viele Vergleiche \\u00fcber Mengen, Massen, Gr\\u00f6\\u00dfen, Entfernungen und Zusammensetzungen im Film gezeigt. Die Galaxis, sowie Nebel und Sterne sind im Film vollst\\u00e4ndig im 3D Raum umgesetzt und dargestellt um ein m\\u00f6glichst realistisches und tiefgehendes Gef\\u00fchl zu vermitteln. Um den Dokumetarcharakter zu unterstreichen wurde der Text zum Film von Dr. Jochen Werner synchronisiert. Au\\u00dferdem werden Grafiken und Schriften eingesetzt um viele Fakten noch ausf\\u00fchrlicher zu erkl\\u00e4ren\", \"format\": \"247 - 1280x720 (DASH video)+140 - audio only (DASH audio)\", \"start_time\": null, \"uploader\": \"UniverseDokus\", \"format_id\": \"247+140\", \"uploader_id\": \"UCy9nKg7GmzmzUYetLS8lIog\", \"subtitles\": {}, \"thumbnails\": [{\"url\": \"https://i.ytimg.com/vi/f2eVjaUi4aw/maxresdefault.jpg\", \"id\": \"0\"}], \"license\": \"Standard YouTube License\", \"alt_title\": null, \"extractor_key\": \"Youtube\", \"vcodec\": \"vp9\", \"thumbnail\": \"https://i.ytimg.com/vi/f2eVjaUi4aw/maxresdefault.jpg\", \"vbr\": null, \"ext\": \"webm\", \"extractor\": \"youtube\", \"end_time\": null, \"webpage_url\": \"https://www.youtube.com/watch?v=f2eVjaUi4aw\", \"formats\": [{\"asr\": 44100, \"tbr\": 120, \"protocol\": \"https\", \"format\": \"171 - audio only (DASH audio)\", \"format_note\": \"DASH audio\", \"height\": null, \"preference\": -50, \"format_id\": \"171\", \"language\": null, \"http_headers\": {\"Accept-Charset\": \"ISO-8859-1,utf-8;q=0.7,*;q=0.7\", \"Accept-Language\": \"en-us,en;q=0.5\", \"Accept-Encoding\": \"gzip, deflate\", \"Accept\": \"text/html,application/xhtml+xml,application/xml;q=0.9,*/*;q=0.8\", \"User-Agent\": \"Mozilla/5.0 (X11; Linux x86_64; rv:10.0) Gecko/20150101 Firefox/47.0 (Chrome)\"}, \"url\": \"https://r3---sn-uxax4vopj5qx-cxge.googlevideo.com/videoplayback?id=7f67958da522e1ac&itag=171&source=youtube&requiressl=yes&mv=m&initcwndbps=1253750&mn=sn-uxax4vopj5qx-cxge&pcm2cms=yes&pl=23&ms=au&mm=31&ratebypass=yes&mime=audio/webm&gir=yes&clen=73467667&lmt=1402538474797662&dur=5777.239&sver=3&fexp=9405967,9406175,9408071,9408211,9416126,9416891,9419452,9422596,9428398,9429610,9431012,9432565,9433096,9433380,9433946,9435526,9435876,9437066,9437552,9438226,9438326,9438546,9438663,9439257,9439441,9439581,9439652,9440154,9440302,9441107,9441560&key=dg_yt0&mt=1468730815&upn=E7GoIBh2kQU&signature=833E6A27EB276AAFED2E9DCB17DA8438F6CC7BB8.6815FF0930B3A506854E8DDF38856195B339116E&ip=92.224.193.50&ipbits=0&expire=1468752599&sparams=ip,ipbits,expire,id,itag,source,requiressl,mv,initcwndbps,mn,pcm2cms,pl,ms,mm,ratebypass,mime,gir,clen,lmt,dur\", \"vcodec\": \"none\", \"abr\": 128, \"width\": null, \"ext\": \"webm\", \"filesize\": 73467667, \"fps\": null, \"acodec\": \"vorbis\"}, {\"asr\": 44100, \"tbr\": 134, \"protocol\": \"https\", \"format\": \"140 - audio only (DASH audio)\", \"format_note\": \"DASH audio\", \"height\": null, \"preference\": -50, \"format_id\": \"140\", \"container\": \"m4a_dash\", \"language\": null, \"http_headers\": {\"Accept-Charset\": \"ISO-8859-1,utf-8;q=0.7,*;q=0.7\", \"Accept-Language\": \"en-us,en;q=0.5\", \"Accept-Encoding\": \"gzip, deflate\", \"Accept\": \"text/html,application/xhtml+xml,application/xml;q=0.9,*/*;q=0.8\", \"User-Agent\": \"Mozilla/5.0 (X11; Linux x86_64; rv:10.0) Gecko/20150101 Firefox/47.0 (Chrome)\"}, \"url\": \"https://r3---sn-uxax4vopj5qx-cxge.googlevideo.com/videoplayback?id=7f67958da522e1ac&itag=140&source=youtube&requiressl=yes&mv=m&initcwndbps=1253750&mn=sn-uxax4vopj5qx-cxge&pcm2cms=yes&pl=23&ms=au&mm=31&ratebypass=yes&mime=audio/mp4&gir=yes&clen=92748451&lmt=1401912778754488&dur=5777.286&sver=3&fexp=9405967,9406175,9408071,9408211,9416126,9416891,9419452,9422596,9428398,9429610,9431012,9432565,9433096,9433380,9433946,9435526,9435876,9437066,9437552,9438226,9438326,9438546,9438663,9439257,9439441,9439581,9439652,9440154,9440302,9441107,9441560&key=dg_yt0&mt=1468730815&upn=E7GoIBh2kQU&signature=39FC7A733A4A6B4157963744FA20AA28B5C0EF77.8602D4D35EF116190EB899F7A612D240AACA0FC6&ip=92.224.193.50&ipbits=0&expire=1468752599&sparams=ip,ipbits,expire,id,itag,source,requiressl,mv,initcwndbps,mn,pcm2cms,pl,ms,mm,ratebypass,mime,gir,clen,lmt,dur\", \"vcodec\": \"none\", \"ext\": \"m4a\", \"width\": null, \"abr\": 128, \"filesize\": 92748451, \"fps\": null, \"acodec\": \"mp4a.40.2\"}, {\"asr\": null, \"tbr\": 130, \"protocol\": \"https\", \"format\": \"160 - 256x144 (DASH video)\", \"format_note\": \"DASH video\", \"height\": 144, \"preference\": -40, \"format_id\": \"160\", \"language\": null, \"http_headers\": {\"Accept-Charset\": \"ISO-8859-1,utf-8;q=0.7,*;q=0.7\", \"Accept-Language\": \"en-us,en;q=0.5\", \"Accept-Encoding\": \"gzip, deflate\", \"Accept\": \"text/html,application/xhtml+xml,application/xml;q=0.9,*/*;q=0.8\", \"User-Agent\": \"Mozilla/5.0 (X11; Linux x86_64; rv:10.0) Gecko/20150101 Firefox/47.0 (Chrome)\"}, \"url\": \"https://r3---sn-uxax4vopj5qx-cxge.googlevideo.com/videoplayback?id=7f67958da522e1ac&itag=160&source=youtube&requiressl=yes&mv=m&initcwndbps=1253750&mn=sn-uxax4vopj5qx-cxge&pcm2cms=yes&pl=23&ms=au&mm=31&ratebypass=yes&mime=video/mp4&gir=yes&clen=79457388&lmt=1401912778854573&dur=5777.201&sver=3&fexp=9405967,9406175,9408071,9408211,9416126,9416891,9419452,9422596,9428398,9429610,9431012,9432565,9433096,9433380,9433946,9435526,9435876,9437066,9437552,9438226,9438326,9438546,9438663,9439257,9439441,9439581,9439652,9440154,9440302,9441107,9441560&key=dg_yt0&mt=1468730815&upn=E7GoIBh2kQU&signature=078949C6A95284941151BA4AEB416F6717BE5B03.66267C58EBB5A95F824215AB42AF3F42D59656CF&ip=92.224.193.50&ipbits=0&expire=1468752599&sparams=ip,ipbits,expire,id,itag,source,requiressl,mv,initcwndbps,mn,pcm2cms,pl,ms,mm,ratebypass,mime,gir,clen,lmt,dur\", \"vcodec\": \"avc1.4d400c\", \"width\": 256, \"ext\": \"mp4\", \"filesize\": 79457388, \"fps\": 13, \"acodec\": \"none\"}, {\"asr\": null, \"tbr\": 145, \"protocol\": \"https\", \"format\": \"278 - 256x144 (DASH video)\", \"format_note\": \"DASH video\", \"height\": 144, \"preference\": -40, \"format_id\": \"278\", \"container\": \"webm\", \"language\": null, \"http_headers\": {\"Accept-Charset\": \"ISO-8859-1,utf-8;q=0.7,*;q=0.7\", \"Accept-Language\": \"en-us,en;q=0.5\", \"Accept-Encoding\": \"gzip, deflate\", \"Accept\": \"text/html,application/xhtml+xml,application/xml;q=0.9,*/*;q=0.8\", \"User-Agent\": \"Mozilla/5.0 (X11; Linux x86_64; rv:10.0) Gecko/20150101 Firefox/47.0 (Chrome)\"}, \"url\": \"https://r3---sn-uxax4vopj5qx-cxge.googlevideo.com/videoplayback?id=7f67958da522e1ac&itag=278&source=youtube&requiressl=yes&mv=m&initcwndbps=1253750&mn=sn-uxax4vopj5qx-cxge&pcm2cms=yes&pl=23&ms=au&mm=31&ratebypass=yes&mime=video/webm&gir=yes&clen=46484244&lmt=1402535037959468&dur=5777.240&sver=3&fexp=9405967,9406175,9408071,9408211,9416126,9416891,9419452,9422596,9428398,9429610,9431012,9432565,9433096,9433380,9433946,9435526,9435876,9437066,9437552,9438226,9438326,9438546,9438663,9439257,9439441,9439581,9439652,9440154,9440302,9441107,9441560&key=dg_yt0&mt=1468730815&upn=E7GoIBh2kQU&signature=30FED9C8C8C80F4DA6C62992C22C3540F17EA4D5.39DFFC050BC738A857DA7631125E6A748411AA06&ip=92.224.193.50&ipbits=0&expire=1468752599&sparams=ip,ipbits,expire,id,itag,source,requiressl,mv,initcwndbps,mn,pcm2cms,pl,ms,mm,ratebypass,mime,gir,clen,lmt,dur\", \"vcodec\": \"vp9\", \"width\": 256, \"ext\": \"webm\", \"filesize\": 46484244, \"fps\": 1, \"acodec\": \"none\"}, {\"asr\": null, \"tbr\": 268, \"protocol\": \"https\", \"format\": \"133 - 426x240 (DASH video)\", \"format_note\": \"DASH video\", \"height\": 240, \"preference\": -40, \"format_id\": \"133\", \"language\": null, \"http_headers\": {\"Accept-Charset\": \"ISO-8859-1,utf-8;q=0.7,*;q=0.7\", \"Accept-Language\": \"en-us,en;q=0.5\", \"Accept-Encoding\": \"gzip, deflate\", \"Accept\": \"text/html,application/xhtml+xml,application/xml;q=0.9,*/*;q=0.8\", \"User-Agent\": \"Mozilla/5.0 (X11; Linux x86_64; rv:10.0) Gecko/20150101 Firefox/47.0 (Chrome)\"}, \"url\": \"https://r3---sn-uxax4vopj5qx-cxge.googlevideo.com/videoplayback?id=7f67958da522e1ac&itag=133&source=youtube&requiressl=yes&mv=m&initcwndbps=1253750&mn=sn-uxax4vopj5qx-cxge&pcm2cms=yes&pl=23&ms=au&mm=31&ratebypass=yes&mime=video/mp4&gir=yes&clen=176479848&lmt=1401912780760007&dur=5777.201&sver=3&fexp=9405967,9406175,9408071,9408211,9416126,9416891,9419452,9422596,9428398,9429610,9431012,9432565,9433096,9433380,9433946,9435526,9435876,9437066,9437552,9438226,9438326,9438546,9438663,9439257,9439441,9439581,9439652,9440154,9440302,9441107,9441560&key=dg_yt0&mt=1468730815&upn=E7GoIBh2kQU&signature=490CE3B0D5CC8092B25348EE1BD1BA0B8FF5EC2F.905160A2C9614C777954AA989B59F8F12F1DB857&ip=92.224.193.50&ipbits=0&expire=1468752599&sparams=ip,ipbits,expire,id,itag,source,requiressl,mv,initcwndbps,mn,pcm2cms,pl,ms,mm,ratebypass,mime,gir,clen,lmt,dur\", \"vcodec\": \"avc1.4d4015\", \"width\": 426, \"ext\": \"mp4\", \"filesize\": 176479848, \"fps\": 25, \"acodec\": \"none\"}, {\"asr\": null, \"tbr\": 384, \"protocol\": \"https\", \"format\": \"242 - 426x240 (DASH video)\", \"format_note\": \"DASH video\", \"height\": 240, \"preference\": -40, \"format_id\": \"242\", \"language\": null, \"http_headers\": {\"Accept-Charset\": \"ISO-8859-1,utf-8;q=0.7,*;q=0.7\", \"Accept-Language\": \"en-us,en;q=0.5\", \"Accept-Encoding\": \"gzip, deflate\", \"Accept\": \"text/html,application/xhtml+xml,application/xml;q=0.9,*/*;q=0.8\", \"User-Agent\": \"Mozilla/5.0 (X11; Linux x86_64; rv:10.0) Gecko/20150101 Firefox/47.0 (Chrome)\"}, \"url\": \"https://r3---sn-uxax4vopj5qx-cxge.googlevideo.com/videoplayback?id=7f67958da522e1ac&itag=242&source=youtube&requiressl=yes&mv=m&initcwndbps=1253750&mn=sn-uxax4vopj5qx-cxge&pcm2cms=yes&pl=23&ms=au&mm=31&ratebypass=yes&mime=video/webm&gir=yes&clen=92314406&lmt=1402535026165802&dur=5777.200&sver=3&fexp=9405967,9406175,9408071,9408211,9416126,9416891,9419452,9422596,9428398,9429610,9431012,9432565,9433096,9433380,9433946,9435526,9435876,9437066,9437552,9438226,9438326,9438546,9438663,9439257,9439441,9439581,9439652,9440154,9440302,9441107,9441560&key=dg_yt0&mt=1468730815&upn=E7GoIBh2kQU&signature=3705F6538379F8DE1E3AF7E70C8FF53AC72CD468.94FBDDB4267F9895CC89CBF23DCA6C7E8ECDC113&ip=92.224.193.50&ipbits=0&expire=1468752599&sparams=ip,ipbits,expire,id,itag,source,requiressl,mv,initcwndbps,mn,pcm2cms,pl,ms,mm,ratebypass,mime,gir,clen,lmt,dur\", \"vcodec\": \"vp9\", \"width\": 426, \"ext\": \"webm\", \"filesize\": 92314406, \"fps\": 1, \"acodec\": \"none\"}, {\"asr\": null, \"tbr\": 604, \"protocol\": \"https\", \"format\": \"243 - 640x360 (DASH video)\", \"format_note\": \"DASH video\", \"height\": 360, \"preference\": -40, \"format_id\": \"243\", \"language\": null, \"http_headers\": {\"Accept-Charset\": \"ISO-8859-1,utf-8;q=0.7,*;q=0.7\", \"Accept-Language\": \"en-us,en;q=0.5\", \"Accept-Encoding\": \"gzip, deflate\", \"Accept\": \"text/html,application/xhtml+xml,application/xml;q=0.9,*/*;q=0.8\", \"User-Agent\": \"Mozilla/5.0 (X11; Linux x86_64; rv:10.0) Gecko/20150101 Firefox/47.0 (Chrome)\"}, \"url\": \"https://r3---sn-uxax4vopj5qx-cxge.googlevideo.com/videoplayback?id=7f67958da522e1ac&itag=243&source=youtube&requiressl=yes&mv=m&initcwndbps=1253750&mn=sn-uxax4vopj5qx-cxge&pcm2cms=yes&pl=23&ms=au&mm=31&ratebypass=yes&mime=video/webm&gir=yes&clen=175882646&lmt=1402535062470152&dur=5777.200&sver=3&fexp=9405967,9406175,9408071,9408211,9416126,9416891,9419452,9422596,9428398,9429610,9431012,9432565,9433096,9433380,9433946,9435526,9435876,9437066,9437552,9438226,9438326,9438546,9438663,9439257,9439441,9439581,9439652,9440154,9440302,9441107,9441560&key=dg_yt0&mt=1468730815&upn=E7GoIBh2kQU&signature=60F90A58735C43F3CB683F86C4F68AB03A3D40C4.7761BE130764532A26F64B4B644FD89FCE77A140&ip=92.224.193.50&ipbits=0&expire=1468752599&sparams=ip,ipbits,expire,id,itag,source,requiressl,mv,initcwndbps,mn,pcm2cms,pl,ms,mm,ratebypass,mime,gir,clen,lmt,dur\", \"vcodec\": \"vp9\", \"width\": 640, \"ext\": \"webm\", \"filesize\": 175882646, \"fps\": 1, \"acodec\": \"none\"}, {\"asr\": null, \"tbr\": 638, \"protocol\": \"https\", \"format\": \"134 - 640x360 (DASH video)\", \"format_note\": \"DASH video\", \"height\": 360, \"preference\": -40, \"format_id\": \"134\", \"language\": null, \"http_headers\": {\"Accept-Charset\": \"ISO-8859-1,utf-8;q=0.7,*;q=0.7\", \"Accept-Language\": \"en-us,en;q=0.5\", \"Accept-Encoding\": \"gzip, deflate\", \"Accept\": \"text/html,application/xhtml+xml,application/xml;q=0.9,*/*;q=0.8\", \"User-Agent\": \"Mozilla/5.0 (X11; Linux x86_64; rv:10.0) Gecko/20150101 Firefox/47.0 (Chrome)\"}, \"url\": \"https://r3---sn-uxax4vopj5qx-cxge.googlevideo.com/videoplayback?id=7f67958da522e1ac&itag=134&source=youtube&requiressl=yes&mv=m&initcwndbps=1253750&mn=sn-uxax4vopj5qx-cxge&pcm2cms=yes&pl=23&ms=au&mm=31&ratebypass=yes&mime=video/mp4&gir=yes&clen=216696275&lmt=1401912788463577&dur=5777.201&sver=3&fexp=9405967,9406175,9408071,9408211,9416126,9416891,9419452,9422596,9428398,9429610,9431012,9432565,9433096,9433380,9433946,9435526,9435876,9437066,9437552,9438226,9438326,9438546,9438663,9439257,9439441,9439581,9439652,9440154,9440302,9441107,9441560&key=dg_yt0&mt=1468730815&upn=E7GoIBh2kQU&signature=2DD45B19361C7E04CA557BBDD0D3A898FB908D6A.8B7FE65D03A917F78AFD40A060C7EFDFC9578FBB&ip=92.224.193.50&ipbits=0&expire=1468752599&sparams=ip,ipbits,expire,id,itag,source,requiressl,mv,initcwndbps,mn,pcm2cms,pl,ms,mm,ratebypass,mime,gir,clen,lmt,dur\", \"vcodec\": \"avc1.4d401e\", \"width\": 640, \"ext\": \"mp4\", \"filesize\": 216696275, \"fps\": 25, \"acodec\": \"none\"}, {\"asr\": null, \"tbr\": 941, \"protocol\": \"https\", \"format\": \"244 - 854x480 (DASH video)\", \"format_note\": \"DASH video\", \"height\": 480, \"preference\": -40, \"format_id\": \"244\", \"language\": null, \"http_headers\": {\"Accept-Charset\": \"ISO-8859-1,utf-8;q=0.7,*;q=0.7\", \"Accept-Language\": \"en-us,en;q=0.5\", \"Accept-Encoding\": \"gzip, deflate\", \"Accept\": \"text/html,application/xhtml+xml,application/xml;q=0.9,*/*;q=0.8\", \"User-Agent\": \"Mozilla/5.0 (X11; Linux x86_64; rv:10.0) Gecko/20150101 Firefox/47.0 (Chrome)\"}, \"url\": \"https://r3---sn-uxax4vopj5qx-cxge.googlevideo.com/videoplayback?id=7f67958da522e1ac&itag=244&source=youtube&requiressl=yes&mv=m&initcwndbps=1253750&mn=sn-uxax4vopj5qx-cxge&pcm2cms=yes&pl=23&ms=au&mm=31&ratebypass=yes&mime=video/webm&gir=yes&clen=325958792&lmt=1402535075690857&dur=5777.200&sver=3&fexp=9405967,9406175,9408071,9408211,9416126,9416891,9419452,9422596,9428398,9429610,9431012,9432565,9433096,9433380,9433946,9435526,9435876,9437066,9437552,9438226,9438326,9438546,9438663,9439257,9439441,9439581,9439652,9440154,9440302,9441107,9441560&key=dg_yt0&mt=1468730815&upn=E7GoIBh2kQU&signature=30F2665A5621D23394FD1D1EA0752E126D4DFC88.748495A7B0BAB3746821E897749FB37F61187E7F&ip=92.224.193.50&ipbits=0&expire=1468752599&sparams=ip,ipbits,expire,id,itag,source,requiressl,mv,initcwndbps,mn,pcm2cms,pl,ms,mm,ratebypass,mime,gir,clen,lmt,dur\", \"vcodec\": \"vp9\", \"width\": 854, \"ext\": \"webm\", \"filesize\": 325958792, \"fps\": 1, \"acodec\": \"none\"}, {\"asr\": null, \"tbr\": 1154, \"protocol\": \"https\", \"format\": \"135 - 854x480 (DASH video)\", \"format_note\": \"DASH video\", \"height\": 480, \"preference\": -40, \"format_id\": \"135\", \"language\": null, \"http_headers\": {\"Accept-Charset\": \"ISO-8859-1,utf-8;q=0.7,*;q=0.7\", \"Accept-Language\": \"en-us,en;q=0.5\", \"Accept-Encoding\": \"gzip, deflate\", \"Accept\": \"text/html,application/xhtml+xml,application/xml;q=0.9,*/*;q=0.8\", \"User-Agent\": \"Mozilla/5.0 (X11; Linux x86_64; rv:10.0) Gecko/20150101 Firefox/47.0 (Chrome)\"}, \"url\": \"https://r3---sn-uxax4vopj5qx-cxge.googlevideo.com/videoplayback?id=7f67958da522e1ac&itag=135&source=youtube&requiressl=yes&mv=m&initcwndbps=1253750&mn=sn-uxax4vopj5qx-cxge&pcm2cms=yes&pl=23&ms=au&mm=31&ratebypass=yes&mime=video/mp4&gir=yes&clen=435006473&lmt=1401912800375097&dur=5777.201&sver=3&fexp=9405967,9406175,9408071,9408211,9416126,9416891,9419452,9422596,9428398,9429610,9431012,9432565,9433096,9433380,9433946,9435526,9435876,9437066,9437552,9438226,9438326,9438546,9438663,9439257,9439441,9439581,9439652,9440154,9440302,9441107,9441560&key=dg_yt0&mt=1468730815&upn=E7GoIBh2kQU&signature=5A2F9D556E8C8B142709289A513FDD0DF7572658.685B606223D167A6F8B635BCBF0AEDBDD1FC316F&ip=92.224.193.50&ipbits=0&expire=1468752599&sparams=ip,ipbits,expire,id,itag,source,requiressl,mv,initcwndbps,mn,pcm2cms,pl,ms,mm,ratebypass,mime,gir,clen,lmt,dur\", \"vcodec\": \"avc1.4d401e\", \"width\": 854, \"ext\": \"mp4\", \"filesize\": 435006473, \"fps\": 25, \"acodec\": \"none\"}, {\"asr\": null, \"tbr\": 2252, \"protocol\": \"https\", \"format\": \"136 - 1280x720 (DASH video)\", \"format_note\": \"DASH video\", \"height\": 720, \"preference\": -40, \"format_id\": \"136\", \"language\": null, \"http_headers\": {\"Accept-Charset\": \"ISO-8859-1,utf-8;q=0.7,*;q=0.7\", \"Accept-Language\": \"en-us,en;q=0.5\", \"Accept-Encoding\": \"gzip, deflate\", \"Accept\": \"text/html,application/xhtml+xml,application/xml;q=0.9,*/*;q=0.8\", \"User-Agent\": \"Mozilla/5.0 (X11; Linux x86_64; rv:10.0) Gecko/20150101 Firefox/47.0 (Chrome)\"}, \"url\": \"https://r3---sn-uxax4vopj5qx-cxge.googlevideo.com/videoplayback?id=7f67958da522e1ac&itag=136&source=youtube&requiressl=yes&mv=m&initcwndbps=1253750&mn=sn-uxax4vopj5qx-cxge&pcm2cms=yes&pl=23&ms=au&mm=31&ratebypass=yes&mime=video/mp4&gir=yes&clen=902414077&lmt=1401912827833911&dur=5777.201&sver=3&fexp=9405967,9406175,9408071,9408211,9416126,9416891,9419452,9422596,9428398,9429610,9431012,9432565,9433096,9433380,9433946,9435526,9435876,9437066,9437552,9438226,9438326,9438546,9438663,9439257,9439441,9439581,9439652,9440154,9440302,9441107,9441560&key=dg_yt0&mt=1468730815&upn=E7GoIBh2kQU&signature=199489738C8A9CC933F5AC955AF652CDE5542D75.1177B32A912FEA9EBDB3B5F0032E62BC19CEB3AE&ip=92.224.193.50&ipbits=0&expire=1468752599&sparams=ip,ipbits,expire,id,itag,source,requiressl,mv,initcwndbps,mn,pcm2cms,pl,ms,mm,ratebypass,mime,gir,clen,lmt,dur\", \"vcodec\": \"avc1.4d401f\", \"width\": 1280, \"ext\": \"mp4\", \"filesize\": 902414077, \"fps\": 25, \"acodec\": \"none\"}, {\"asr\": null, \"tbr\": 2460, \"protocol\": \"https\", \"format\": \"247 - 1280x720 (DASH video)\", \"format_note\": \"DASH video\", \"height\": 720, \"preference\": -40, \"format_id\": \"247\", \"language\": null, \"http_headers\": {\"Accept-Charset\": \"ISO-8859-1,utf-8;q=0.7,*;q=0.7\", \"Accept-Language\": \"en-us,en;q=0.5\", \"Accept-Encoding\": \"gzip, deflate\", \"Accept\": \"text/html,application/xhtml+xml,application/xml;q=0.9,*/*;q=0.8\", \"User-Agent\": \"Mozilla/5.0 (X11; Linux x86_64; rv:10.0) Gecko/20150101 Firefox/47.0 (Chrome)\"}, \"url\": \"https://r3---sn-uxax4vopj5qx-cxge.googlevideo.com/videoplayback?id=7f67958da522e1ac&itag=247&source=youtube&requiressl=yes&mv=m&initcwndbps=1253750&mn=sn-uxax4vopj5qx-cxge&pcm2cms=yes&pl=23&ms=au&mm=31&ratebypass=yes&mime=video/webm&gir=yes&clen=645831639&lmt=1402535099032338&dur=5777.200&sver=3&fexp=9405967,9406175,9408071,9408211,9416126,9416891,9419452,9422596,9428398,9429610,9431012,9432565,9433096,9433380,9433946,9435526,9435876,9437066,9437552,9438226,9438326,9438546,9438663,9439257,9439441,9439581,9439652,9440154,9440302,9441107,9441560&key=dg_yt0&mt=1468730815&upn=E7GoIBh2kQU&signature=29E93BFD7C6AF7DFB03EA525B6AF028D4C6AD412.91867806981E520DDDD3022D392C70C6EDEE7BBA&ip=92.224.193.50&ipbits=0&expire=1468752599&sparams=ip,ipbits,expire,id,itag,source,requiressl,mv,initcwndbps,mn,pcm2cms,pl,ms,mm,ratebypass,mime,gir,clen,lmt,dur\", \"vcodec\": \"vp9\", \"width\": 1280, \"ext\": \"webm\", \"filesize\": 645831639, \"fps\": 1, \"acodec\": \"none\"}, {\"http_headers\": {\"Accept-Charset\": \"ISO-8859-1,utf-8;q=0.7,*;q=0.7\", \"Accept-Language\": \"en-us,en;q=0.5\", \"Accept-Encoding\": \"gzip, deflate\", \"Accept\": \"text/html,application/xhtml+xml,application/xml;q=0.9,*/*;q=0.8\", \"User-Agent\": \"Mozilla/5.0 (X11; Linux x86_64; rv:10.0) Gecko/20150101 Firefox/47.0 (Chrome)\"}, \"protocol\": \"https\", \"format\": \"17 - 176x144 (small)\", \"url\": \"https://r3---sn-uxax4vopj5qx-cxge.googlevideo.com/videoplayback?sver=3&pcm2cms=yes&key=yt6&ei=dg6LV9XTJsKJjAaBhLqQBQ&mm=31&ipbits=0&mn=sn-uxax4vopj5qx-cxge&pl=23&sparams=dur%2Cei%2Cid%2Cinitcwndbps%2Cip%2Cipbits%2Citag%2Clmt%2Cmime%2Cmm%2Cmn%2Cms%2Cmv%2Cpcm2cms%2Cpl%2Crequiressl%2Csource%2Cupn%2Cexpire&fexp=9405967%2C9406175%2C9408071%2C9408211%2C9416126%2C9416891%2C9419452%2C9422596%2C9428398%2C9429610%2C9431012%2C9432565%2C9433096%2C9433380%2C9433946%2C9435526%2C9435876%2C9437066%2C9437552%2C9438226%2C9438326%2C9438546%2C9438663%2C9439257%2C9439441%2C9439581%2C9439652%2C9440154%2C9440302%2C9441107%2C9441560&id=o-AM6ZNlKsD8nY0RllVTjw0DTyzbycgcMiV96h9XMjw59e&mt=1468730815&dur=5777.403&mv=m&initcwndbps=1253750&ms=au&itag=17&requiressl=yes&mime=video%2F3gpp&ip=92.224.193.50&expire=1468752598&lmt=1399831344742287&signature=7680BC941C57BDC63D8FE4A6C7DBE3B2D68119FD.D6087C7385759005272EB9C09AA1FE50808BF190&upn=UVF9SvYVp0I&source=youtube&ratebypass=yes\", \"vcodec\": \"mp4v.20.3\", \"format_note\": \"small\", \"ext\": \"3gp\", \"player_url\": null, \"width\": 176, \"abr\": 24, \"format_id\": \"17\", \"height\": 144, \"resolution\": \"176x144\", \"acodec\": \" mp4a.40.2\"}, {\"http_headers\": {\"Accept-Charset\": \"ISO-8859-1,utf-8;q=0.7,*;q=0.7\", \"Accept-Language\": \"en-us,en;q=0.5\", \"Accept-Encoding\": \"gzip, deflate\", \"Accept\": \"text/html,application/xhtml+xml,application/xml;q=0.9,*/*;q=0.8\", \"User-Agent\": \"Mozilla/5.0 (X11; Linux x86_64; rv:10.0) Gecko/20150101 Firefox/47.0 (Chrome)\"}, \"protocol\": \"https\", \"format\": \"36 - 320x180 (small)\", \"url\": \"https://r3---sn-uxax4vopj5qx-cxge.googlevideo.com/videoplayback?sver=3&pcm2cms=yes&key=yt6&ei=dg6LV9XTJsKJjAaBhLqQBQ&mm=31&ipbits=0&mn=sn-uxax4vopj5qx-cxge&pl=23&sparams=dur%2Cei%2Cid%2Cinitcwndbps%2Cip%2Cipbits%2Citag%2Clmt%2Cmime%2Cmm%2Cmn%2Cms%2Cmv%2Cpcm2cms%2Cpl%2Crequiressl%2Csource%2Cupn%2Cexpire&fexp=9405967%2C9406175%2C9408071%2C9408211%2C9416126%2C9416891%2C9419452%2C9422596%2C9428398%2C9429610%2C9431012%2C9432565%2C9433096%2C9433380%2C9433946%2C9435526%2C9435876%2C9437066%2C9437552%2C9438226%2C9438326%2C9438546%2C9438663%2C9439257%2C9439441%2C9439581%2C9439652%2C9440154%2C9440302%2C9441107%2C9441560&id=o-AM6ZNlKsD8nY0RllVTjw0DTyzbycgcMiV96h9XMjw59e&mt=1468730815&dur=5777.449&mv=m&initcwndbps=1253750&ms=au&itag=36&requiressl=yes&mime=video%2F3gpp&ip=92.224.193.50&expire=1468752598&lmt=1399832575713698&signature=D15D6495ACF45AE163F079420BCC50D3F294DC88.7F41FB829E8632AE23AE22BCC2002E8FD7FD9E69&upn=UVF9SvYVp0I&source=youtube&ratebypass=yes\", \"vcodec\": \"mp4v.20.3\", \"format_note\": \"small\", \"height\": 180, \"width\": 320, \"ext\": \"3gp\", \"format_id\": \"36\", \"player_url\": null, \"resolution\": \"320x180\", \"acodec\": \" mp4a.40.2\"}, {\"http_headers\": {\"Accept-Charset\": \"ISO-8859-1,utf-8;q=0.7,*;q=0.7\", \"Accept-Language\": \"en-us,en;q=0.5\", \"Accept-Encoding\": \"gzip, deflate\", \"Accept\": \"text/html,application/xhtml+xml,application/xml;q=0.9,*/*;q=0.8\", \"User-Agent\": \"Mozilla/5.0 (X11; Linux x86_64; rv:10.0) Gecko/20150101 Firefox/47.0 (Chrome)\"}, \"protocol\": \"https\", \"format\": \"43 - 640x360 (medium)\", \"url\": \"https://r3---sn-uxax4vopj5qx-cxge.googlevideo.com/videoplayback?sver=3&pcm2cms=yes&key=yt6&ei=dg6LV9XTJsKJjAaBhLqQBQ&mm=31&ipbits=0&mn=sn-uxax4vopj5qx-cxge&pl=23&sparams=dur%2Cei%2Cid%2Cinitcwndbps%2Cip%2Cipbits%2Citag%2Clmt%2Cmime%2Cmm%2Cmn%2Cms%2Cmv%2Cpcm2cms%2Cpl%2Cratebypass%2Crequiressl%2Csource%2Cupn%2Cexpire&fexp=9405967%2C9406175%2C9408071%2C9408211%2C9416126%2C9416891%2C9419452%2C9422596%2C9428398%2C9429610%2C9431012%2C9432565%2C9433096%2C9433380%2C9433946%2C9435526%2C9435876%2C9437066%2C9437552%2C9438226%2C9438326%2C9438546%2C9438663%2C9439257%2C9439441%2C9439581%2C9439652%2C9440154%2C9440302%2C9441107%2C9441560&id=o-AM6ZNlKsD8nY0RllVTjw0DTyzbycgcMiV96h9XMjw59e&mt=1468730815&dur=0.000&mv=m&initcwndbps=1253750&ms=au&itag=43&requiressl=yes&mime=video%2Fwebm&ip=92.224.193.50&expire=1468752598&ratebypass=yes&lmt=1399840175735730&signature=C70BA8C83C896528E8512D51FEAC31576AC60191.06DC85C2C08171B2279BD98745F8BF9AF42DEA1C&upn=UVF9SvYVp0I&source=youtube\", \"vcodec\": \"vp8.0\", \"format_note\": \"medium\", \"ext\": \"webm\", \"player_url\": null, \"width\": 640, \"abr\": 128, \"format_id\": \"43\", \"height\": 360, \"resolution\": \"640x360\", \"acodec\": \" vorbis\"}, {\"http_headers\": {\"Accept-Charset\": \"ISO-8859-1,utf-8;q=0.7,*;q=0.7\", \"Accept-Language\": \"en-us,en;q=0.5\", \"Accept-Encoding\": \"gzip, deflate\", \"Accept\": \"text/html,application/xhtml+xml,application/xml;q=0.9,*/*;q=0.8\", \"User-Agent\": \"Mozilla/5.0 (X11; Linux x86_64; rv:10.0) Gecko/20150101 Firefox/47.0 (Chrome)\"}, \"protocol\": \"https\", \"format\": \"18 - 640x360 (medium)\", \"url\": \"https://r3---sn-uxax4vopj5qx-cxge.googlevideo.com/videoplayback?sver=3&pcm2cms=yes&key=yt6&ei=dg6LV9XTJsKJjAaBhLqQBQ&mm=31&ipbits=0&mn=sn-uxax4vopj5qx-cxge&pl=23&sparams=dur%2Cei%2Cid%2Cinitcwndbps%2Cip%2Cipbits%2Citag%2Clmt%2Cmime%2Cmm%2Cmn%2Cms%2Cmv%2Cpcm2cms%2Cpl%2Cratebypass%2Crequiressl%2Csource%2Cupn%2Cexpire&fexp=9405967%2C9406175%2C9408071%2C9408211%2C9416126%2C9416891%2C9419452%2C9422596%2C9428398%2C9429610%2C9431012%2C9432565%2C9433096%2C9433380%2C9433946%2C9435526%2C9435876%2C9437066%2C9437552%2C9438226%2C9438326%2C9438546%2C9438663%2C9439257%2C9439441%2C9439581%2C9439652%2C9440154%2C9440302%2C9441107%2C9441560&id=o-AM6ZNlKsD8nY0RllVTjw0DTyzbycgcMiV96h9XMjw59e&mt=1468730815&dur=5777.287&mv=m&initcwndbps=1253750&ms=au&itag=18&requiressl=yes&mime=video%2Fmp4&ip=92.224.193.50&expire=1468752598&ratebypass=yes&lmt=1401913525986491&signature=25EDC039C0CA40C945DB0259CEBBDCE73EAB0D1F.B1DB353131BE7B1437AFC645646D2B8571164A41&upn=UVF9SvYVp0I&source=youtube\", \"vcodec\": \"avc1.42001E\", \"format_note\": \"medium\", \"ext\": \"mp4\", \"player_url\": null, \"width\": 640, \"abr\": 96, \"format_id\": \"18\", \"height\": 360, \"resolution\": \"640x360\", \"acodec\": \" mp4a.40.2\"}, {\"http_headers\": {\"Accept-Charset\": \"ISO-8859-1,utf-8;q=0.7,*;q=0.7\", \"Accept-Language\": \"en-us,en;q=0.5\", \"Accept-Encoding\": \"gzip, deflate\", \"Accept\": \"text/html,application/xhtml+xml,application/xml;q=0.9,*/*;q=0.8\", \"User-Agent\": \"Mozilla/5.0 (X11; Linux x86_64; rv:10.0) Gecko/20150101 Firefox/47.0 (Chrome)\"}, \"protocol\": \"https\", \"format\": \"22 - 1280x720 (hd720)\", \"url\": \"https://r3---sn-uxax4vopj5qx-cxge.googlevideo.com/videoplayback?sver=3&pcm2cms=yes&key=yt6&ei=dg6LV9XTJsKJjAaBhLqQBQ&mm=31&ipbits=0&mn=sn-uxax4vopj5qx-cxge&pl=23&sparams=cnr%2Cdur%2Cei%2Cid%2Cinitcwndbps%2Cip%2Cipbits%2Citag%2Clmt%2Cmime%2Cmm%2Cmn%2Cms%2Cmv%2Cpcm2cms%2Cpl%2Cratebypass%2Crequiressl%2Csource%2Cupn%2Cexpire&fexp=9405967%2C9406175%2C9408071%2C9408211%2C9416126%2C9416891%2C9419452%2C9422596%2C9428398%2C9429610%2C9431012%2C9432565%2C9433096%2C9433380%2C9433946%2C9435526%2C9435876%2C9437066%2C9437552%2C9438226%2C9438326%2C9438546%2C9438663%2C9439257%2C9439441%2C9439581%2C9439652%2C9440154%2C9440302%2C9441107%2C9441560&cnr=14&id=o-AM6ZNlKsD8nY0RllVTjw0DTyzbycgcMiV96h9XMjw59e&mt=1468730815&dur=5777.287&mv=m&initcwndbps=1253750&ms=au&itag=22&requiressl=yes&mime=video%2Fmp4&ip=92.224.193.50&expire=1468752598&ratebypass=yes&lmt=1401914007605033&signature=4CF6E987E7F8BFA178DAF1EA26AD6A1BDB95B260.24D13155A296F093AFC54D8C8B27FAC1D63F51C3&upn=UVF9SvYVp0I&source=youtube\", \"vcodec\": \"avc1.64001F\", \"format_note\": \"hd720\", \"ext\": \"mp4\", \"player_url\": null, \"width\": 1280, \"abr\": 192, \"format_id\": \"22\", \"height\": 720, \"resolution\": \"1280x720\", \"acodec\": \" mp4a.40.2\"}], \"resolution\": null, \"width\": 1280}";

	@Test
	public void testParse() throws Exception {
		InputStream stream = new ByteArrayInputStream(YOUTUBE_SAMPLE_JSON.getBytes(StandardCharsets.UTF_8));
		DownloadMetadataStreamParser parser=new DownloadMetadataStreamParser();
		DownloadMetadata downloadMetadata = parser.apply(stream);
		Assert.assertNotNull(downloadMetadata);
	}


}