package com.fleta.productsservice.adapter.rest;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fleta.productsservice.domain.dto.ProductsDetailDto;
import com.fleta.productsservice.domain.dto.ProductsDto;
import com.fleta.productsservice.domain.dto.ProductsParam;
import com.fleta.productsservice.port.inbound.ProductsService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@Slf4j
@RestController
@RequestMapping("/products")
public class ProductController {

    private ProductsService productsService;

    @Autowired
    public ProductController(ProductsService productService) {
        this.productsService = productService;
    }

    @GetMapping("/testAlbum")
    public List<ProductsDto> getTestApi() {
        long start = System.currentTimeMillis();
        //Sample
        List<ProductsParam> lProductsDto = new ArrayList<ProductsParam>();

        ProductsParam productsParam = new ProductsParam();
        productsParam.setAlbum_group_id("71097");
        productsParam.setAlbum_group_nm("71097");
        productsParam.setQuality_type("1");
        productsParam.setSeries_no("71097");
        productsParam.setRank_no("1");
        productsParam.setContents_id("71097");
        productsParam.setDubbing_yn("Y");
        productsParam.setCaption_yn("Y");
        productsParam.setOrder_no("2");

        lProductsDto.add(productsParam);
        productsParam = new ProductsParam();
        productsParam.setAlbum_group_id("71118");
        productsParam.setAlbum_group_nm("71118");
        productsParam.setQuality_type("2");
        productsParam.setSeries_no("71118");
        productsParam.setRank_no("2");
        productsParam.setContents_id("71118");
        productsParam.setDubbing_yn("Y");
        productsParam.setCaption_yn("Y");
        productsParam.setOrder_no("1");
        lProductsDto.add(productsParam);

        String value = null;
        ObjectMapper objectMapper = new ObjectMapper();
        try {
            value = objectMapper.writeValueAsString(lProductsDto);

            value = value;
            log.info("getTestApi()" + value);
        } catch (JsonProcessingException e) {
            e.printStackTrace();
        }

        log.info("-----start: " + (System.currentTimeMillis() - start));
        List<ProductsDto> productsDto = productsService.nxvod211TobeSql00502(value);

        log.info("-------end" + (System.currentTimeMillis() -start));
        return productsDto;

    }

    @GetMapping("/testDetail1")
    public List<ProductsDetailDto> getTestDetail1() {
        String value = null;
        StringBuffer sql = new StringBuffer();
        sql.append("                      [{\"album_id\" : \"album_id\", \"album_name\" : \"album_name\"                                                                                                       \n");
        sql.append("                      , \"series_desc\" : \"series_desc\", \"onair_date\" : \"onair_date\", \"release_date\" : \"release_date\", \"watch_2ndtv_yn\" : \"watch_2ndtv_yn\"                    \n");
        sql.append("                      , \"high_quality_type\" : \"high_quality_type\", \"run_time\" : \"run_time\", \"event_info\" : \"event_info\", \"service_icon\" : \"service_icon\"                    \n");
        sql.append("                      , \"terr_yn\" : \"terr_yn\", \"terr_ed_date\" : \"terr_ed_date\", \"smi_yn\" : \"smi_yn\", \"smi_language\" : \"smi_language\"                                        \n");
        sql.append("                      , \"rating_cd\" : \"rating_cd\", \"kids_grade\" : \"kids_grade\", \"country_of_origin_cd\" : \"country_of_origin_cd\", \"director_display\" : \"director_display\"	\n");
        sql.append("                      , \"producer\" : \"producer\", \"starring_actor\" : \"starring_actor\", \"actors_display\" : \"actors_display\", \"voice_actor\" : \"voice_actor\"                    \n");
        sql.append("                      , \"studio\" : \"studio\", \"genre_large\" : \"genre_large\", \"genre_mid\" : \"genre_mid\", \"genre_small\" : \"genre_small\"                                        \n");
        sql.append("                      , \"introduction\" : \"introduction\", \"sub_title\" : \"sub_title\", \"summary_medium\" : \"summary_medium\", \"summary_long\" : \"summary_long\"                    \n");
        sql.append("                      , \"avg_rating\" : \"avg_rating\", \"tot_rating_count\" : \"tot_rating_count\", \"comment_cnt\" : \"comment_cnt\", \"cine_id\" : \"cine_id\"                          \n");
        sql.append("                      , \"cine_avg_point\" : \"cine_avg_point\", \"cine_count\" : \"cine_count\", \"series_no\" : \"series_no\", \"viewing_flag\" : \"viewing_flag\"                        \n");
        sql.append("                      , \"rank_no\" : \"1.0\", \"dubbing_yn\" : \"dubbing_yn\", \"caption_yn\" : \"caption_yn\", \"quality_type\" : \"quality_type\"                                    \n");
        sql.append("                      , \"dubbing\" : \"dubbing\", \"summary_promotion\" : \"summary_promotion\", \"sale_type\" : \"sale_type\", \"album_group_nm\" : \"album_group_nm\"                    \n");
        sql.append("                      , \"super_yn\" : \"super_yn\", \"promotion_copy\" : \"promotion_copy\", \"audio_type\" : \"audio_type\", \"poster_type\" : \"poster_type\"                            \n");
        sql.append("                      , \"service_yn\" : \"service_yn\", \"content_value\" : \"content_value\", \"reserved_flag\" : \"reserved_flag\"                                                       \n");
        sql.append("                      , \"reserved_date\" : \"reserved_date\", \"asset_id\" : \"M01164P401PPV00SH100\"                                                                                      \n");
        sql.append("                      }]                                                                                                                                                                   \n");
        value = sql.toString();

        //rank_no test
        StringBuffer sql1 = new StringBuffer();
        sql1.append("[{\"album_id\":\"M011516030PPV00\",\"album_name\":\"겨울이 오고 있다\",\"series_desc\":\"1회\",\"onair_date\":\"\",\"release_date\":\"\",\"watch_2ndtv_yn\":\"N\",\"high_quality_type\":\"\",\"run_time\":\"01013600\",\"event_info\":\"\",\"service_icon\":\"\",\"terr_yn\":\"0\",\"terr_ed_date\":\"\",\"smi_yn\":\"Y\",\"smi_language\":\"\",\"rating_cd\":\"05\",\"kids_grade\":\"\",\"country_of_origin_cd\":\"US\",\"director_display\":\"팀 반 패튼\",\"producer\":\"팀 반 패튼\",\"starring_actor\":\"숀 빈,마크 애디,미셸 페얼리\",\"actors_display\":\"주연: 숀 빈, 마크 애디\",\"voice_actor\":\"\",\"studio\":\"\",\"genre_large\":\"해외시리즈\",\"genre_mid\":\"미국\",\"genre_small\":\"판타지\",\"introduction\":\"\",\"sub_title\":\"\",\"summary_medium\":\"탈영자는 윈터펠 밖에서 잡히고 윈터펠의 왕인 에다드 스타크는 그를 즉각 처분한다.\",\"summary_long\":\"허구의 세계인 웨스테로스 대륙의 7개의 국가와 하위 몇 개의 국가들로 구성된 칠 왕국의 통치권, 철의 왕좌를 차지하기 위한 싸움을 그려낸 드라마. 탈영자는 윈터펠 밖에서 잡히고 윈터펠의 왕인 에다드 스타크는 그를 즉각 처분한다.\",\"avg_rating\":\"\",\"tot_rating_count\":\"\",\"comment_cnt\":\"\",\"cine_id\":\"\",\"cine_avg_point\":\"\",\"cine_count\":\"\",\"series_no\":\"1\",\"viewing_flag\":\"V\",\"rank_no\":\"10.0\",\"dubbing_yn\":\"n\",\"caption_yn\":\"Y\",\"quality_type\":\"n\",\"dubbing\":\"N\",\"summary_promotion\":\"\",\"sale_type\":\"X\",\"album_group_nm\":\"겨울이 오고 있다\",\"super_yn\":\"Y\",\"promotion_copy\":\"\",\"audio_type\":\"Stereo\",\"poster_type\":\"P\",\"service_yn\":\"Y\",\"content_value\":\"M011516030PPV00SH110.png\",\"reserved_flag\":\"\",\"reserved_date\":\"\",\"asset_id\":\"M011516030PPV00HD100\"}\n");
        sql1.append(",{\"album_id\":\"M011516030PPV00\",\"album_name\":\"겨울이 오고 있다\",\"series_desc\":\"1회\",\"onair_date\":\"\",\"release_date\":\"\",\"watch_2ndtv_yn\":\"N\",\"high_quality_type\":\"\",\"run_time\":\"01013600\",\"event_info\":\"\",\"service_icon\":\"\",\"terr_yn\":\"0\",\"terr_ed_date\":\"\",\"smi_yn\":\"Y\",\"smi_language\":\"\",\"rating_cd\":\"05\",\"kids_grade\":\"\",\"country_of_origin_cd\":\"US\",\"director_display\":\"팀 반 패튼\",\"producer\":\"팀 반 패튼\",\"starring_actor\":\"숀 빈,마크 애디,미셸 페얼리\",\"actors_display\":\"주연: 숀 빈, 마크 애디\",\"voice_actor\":\"\",\"studio\":\"\",\"genre_large\":\"해외시리즈\",\"genre_mid\":\"미국\",\"genre_small\":\"판타지\",\"introduction\":\"\",\"sub_title\":\"\",\"summary_medium\":\"탈영자는 윈터펠 밖에서 잡히고 윈터펠의 왕인 에다드 스타크는 그를 즉각 처분한다.\",\"summary_long\":\"허구의 세계인 웨스테로스 대륙의 7개의 국가와 하위 몇 개의 국가들로 구성된 칠 왕국의 통치권, 철의 왕좌를 차지하기 위한 싸움을 그려낸 드라마. 탈영자는 윈터펠 밖에서 잡히고 윈터펠의 왕인 에다드 스타크는 그를 즉각 처분한다.\",\"avg_rating\":\"\",\"tot_rating_count\":\"\",\"comment_cnt\":\"\",\"cine_id\":\"\",\"cine_avg_point\":\"\",\"cine_count\":\"\",\"series_no\":\"1\",\"viewing_flag\":\"V\",\"rank_no\":\"10.0\",\"dubbing_yn\":\"n\",\"caption_yn\":\"Y\",\"quality_type\":\"n\",\"dubbing\":\"N\",\"summary_promotion\":\"\",\"sale_type\":\"X\",\"album_group_nm\":\"겨울이 오고 있다\",\"super_yn\":\"Y\",\"promotion_copy\":\"\",\"audio_type\":\"Stereo\",\"poster_type\":\"R\",\"service_yn\":\"Y\",\"content_value\":\"M011516030PPV00_R_163403.jpg\",\"reserved_flag\":\"\",\"reserved_date\":\"\",\"asset_id\":\"M011516030PPV00HD100\"}\n");
        sql1.append(",{\"album_id\":\"M011516030PPV00\",\"album_name\":\"겨울이 오고 있다\",\"series_desc\":\"1회\",\"onair_date\":\"\",\"release_date\":\"\",\"watch_2ndtv_yn\":\"N\",\"high_quality_type\":\"\",\"run_time\":\"01013600\",\"event_info\":\"\",\"service_icon\":\"\",\"terr_yn\":\"0\",\"terr_ed_date\":\"\",\"smi_yn\":\"Y\",\"smi_language\":\"\",\"rating_cd\":\"05\",\"kids_grade\":\"\",\"country_of_origin_cd\":\"US\",\"director_display\":\"팀 반 패튼\",\"producer\":\"팀 반 패튼\",\"starring_actor\":\"숀 빈,마크 애디,미셸 페얼리\",\"actors_display\":\"주연: 숀 빈, 마크 애디\",\"voice_actor\":\"\",\"studio\":\"\",\"genre_large\":\"해외시리즈\",\"genre_mid\":\"미국\",\"genre_small\":\"판타지\",\"introduction\":\"\",\"sub_title\":\"\",\"summary_medium\":\"탈영자는 윈터펠 밖에서 잡히고 윈터펠의 왕인 에다드 스타크는 그를 즉각 처분한다.\",\"summary_long\":\"허구의 세계인 웨스테로스 대륙의 7개의 국가와 하위 몇 개의 국가들로 구성된 칠 왕국의 통치권, 철의 왕좌를 차지하기 위한 싸움을 그려낸 드라마. 탈영자는 윈터펠 밖에서 잡히고 윈터펠의 왕인 에다드 스타크는 그를 즉각 처분한다.\",\"avg_rating\":\"\",\"tot_rating_count\":\"\",\"comment_cnt\":\"\",\"cine_id\":\"\",\"cine_avg_point\":\"\",\"cine_count\":\"\",\"series_no\":\"1\",\"viewing_flag\":\"V\",\"rank_no\":\"10.0\",\"dubbing_yn\":\"n\",\"caption_yn\":\"Y\",\"quality_type\":\"n\",\"dubbing\":\"N\",\"summary_promotion\":\"\",\"sale_type\":\"X\",\"album_group_nm\":\"겨울이 오고 있다\",\"super_yn\":\"Y\",\"promotion_copy\":\"\",\"audio_type\":\"Stereo\",\"poster_type\":\"V\",\"service_yn\":\"Y\",\"content_value\":\"M011516030PPV00SH170.jpg\",\"reserved_flag\":\"\",\"reserved_date\":\"\",\"asset_id\":\"M011516030PPV00HD100\"}\n");
        sql1.append(",{\"album_id\":\"M011516030PPV00\",\"album_name\":\"겨울이 오고 있다\",\"series_desc\":\"1회\",\"onair_date\":\"\",\"release_date\":\"\",\"watch_2ndtv_yn\":\"N\",\"high_quality_type\":\"\",\"run_time\":\"01013600\",\"event_info\":\"\",\"service_icon\":\"\",\"terr_yn\":\"0\",\"terr_ed_date\":\"\",\"smi_yn\":\"Y\",\"smi_language\":\"\",\"rating_cd\":\"05\",\"kids_grade\":\"\",\"country_of_origin_cd\":\"US\",\"director_display\":\"팀 반 패튼\",\"producer\":\"팀 반 패튼\",\"starring_actor\":\"숀 빈,마크 애디,미셸 페얼리\",\"actors_display\":\"주연: 숀 빈, 마크 애디\",\"voice_actor\":\"\",\"studio\":\"\",\"genre_large\":\"해외시리즈\",\"genre_mid\":\"미국\",\"genre_small\":\"판타지\",\"introduction\":\"\",\"sub_title\":\"\",\"summary_medium\":\"탈영자는 윈터펠 밖에서 잡히고 윈터펠의 왕인 에다드 스타크는 그를 즉각 처분한다.\",\"summary_long\":\"허구의 세계인 웨스테로스 대륙의 7개의 국가와 하위 몇 개의 국가들로 구성된 칠 왕국의 통치권, 철의 왕좌를 차지하기 위한 싸움을 그려낸 드라마. 탈영자는 윈터펠 밖에서 잡히고 윈터펠의 왕인 에다드 스타크는 그를 즉각 처분한다.\",\"avg_rating\":\"\",\"tot_rating_count\":\"\",\"comment_cnt\":\"\",\"cine_id\":\"\",\"cine_avg_point\":\"\",\"cine_count\":\"\",\"series_no\":\"1\",\"viewing_flag\":\"V\",\"rank_no\":\"10.0\",\"dubbing_yn\":\"n\",\"caption_yn\":\"Y\",\"quality_type\":\"n\",\"dubbing\":\"N\",\"summary_promotion\":\"\",\"sale_type\":\"X\",\"album_group_nm\":\"겨울이 오고 있다\",\"super_yn\":\"Y\",\"promotion_copy\":\"\",\"audio_type\":\"Stereo\",\"poster_type\":\"Y\",\"service_yn\":\"Y\",\"content_value\":\"M011516030PPV00SH160.jpg\",\"reserved_flag\":\"\",\"reserved_date\":\"\",\"asset_id\":\"M011516030PPV00HD100\"}\n");
        sql1.append(",{\"album_id\":\"M011516030PPV00\",\"album_name\":\"겨울이 오고 있다\",\"series_desc\":\"1회\",\"onair_date\":\"\",\"release_date\":\"\",\"watch_2ndtv_yn\":\"N\",\"high_quality_type\":\"\",\"run_time\":\"01013600\",\"event_info\":\"\",\"service_icon\":\"\",\"terr_yn\":\"0\",\"terr_ed_date\":\"\",\"smi_yn\":\"Y\",\"smi_language\":\"\",\"rating_cd\":\"05\",\"kids_grade\":\"\",\"country_of_origin_cd\":\"US\",\"director_display\":\"팀 반 패튼\",\"producer\":\"팀 반 패튼\",\"starring_actor\":\"숀 빈,마크 애디,미셸 페얼리\",\"actors_display\":\"주연: 숀 빈, 마크 애디\",\"voice_actor\":\"\",\"studio\":\"\",\"genre_large\":\"해외시리즈\",\"genre_mid\":\"미국\",\"genre_small\":\"판타지\",\"introduction\":\"\",\"sub_title\":\"\",\"summary_medium\":\"탈영자는 윈터펠 밖에서 잡히고 윈터펠의 왕인 에다드 스타크는 그를 즉각 처분한다.\",\"summary_long\":\"허구의 세계인 웨스테로스 대륙의 7개의 국가와 하위 몇 개의 국가들로 구성된 칠 왕국의 통치권, 철의 왕좌를 차지하기 위한 싸움을 그려낸 드라마. 탈영자는 윈터펠 밖에서 잡히고 윈터펠의 왕인 에다드 스타크는 그를 즉각 처분한다.\",\"avg_rating\":\"\",\"tot_rating_count\":\"\",\"comment_cnt\":\"\",\"cine_id\":\"\",\"cine_avg_point\":\"\",\"cine_count\":\"\",\"series_no\":\"1\",\"viewing_flag\":\"V\",\"rank_no\":\"10.0\",\"dubbing_yn\":\"n\",\"caption_yn\":\"Y\",\"quality_type\":\"n\",\"dubbing\":\"N\",\"summary_promotion\":\"\",\"sale_type\":\"X\",\"album_group_nm\":\"겨울이 오고 있다\",\"super_yn\":\"Y\",\"promotion_copy\":\"\",\"audio_type\":\"Stereo\",\"poster_type\":\"Z\",\"service_yn\":\"Y\",\"content_value\":\"M011516030PPV00HD180.zip\",\"reserved_flag\":\"\",\"reserved_date\":\"\",\"asset_id\":\"M011516030PPV00HD100\"}\n");
        sql1.append(",{\"album_id\":\"M011516031PPV00\",\"album_name\":\"왕의 길\",\"series_desc\":\"2회\",\"onair_date\":\"\",\"release_date\":\"\",\"watch_2ndtv_yn\":\"N\",\"high_quality_type\":\"\",\"run_time\":\"00551500\",\"event_info\":\"\",\"service_icon\":\"\",\"terr_yn\":\"\",\"terr_ed_date\":\"\",\"smi_yn\":\"Y\",\"smi_language\":\"\",\"rating_cd\":\"05\",\"kids_grade\":\"\",\"country_of_origin_cd\":\"US\",\"director_display\":\"팀 반 패튼\",\"producer\":\"팀 반 패튼\",\"starring_actor\":\"숀 빈,마크 애디,미셸 페얼리\",\"actors_display\":\"주연: 숀 빈, 마크 애디\",\"voice_actor\":\"\",\"studio\":\"\",\"genre_large\":\"해외시리즈\",\"genre_mid\":\"미국\",\"genre_small\":\"판타지\",\"introduction\":\"\",\"sub_title\":\"\",\"summary_medium\":\"에다드는 왕의 핸드가 되는 것에 동의하고 딸 산사, 아리아와 함께 웨스테로스로 떠나게 된다.\",\"summary_long\":\"에다드는 왕의 핸드가 되는 것에 동의하고 딸 산사, 아리아와 함께 웨스테로스로 떠나게 된다.\",\"avg_rating\":\"\",\"tot_rating_count\":\"\",\"comment_cnt\":\"\",\"cine_id\":\"\",\"cine_avg_point\":\"\",\"cine_count\":\"\",\"series_no\":\"2\",\"viewing_flag\":\"V\",\"rank_no\":\"9.0\",\"dubbing_yn\":\"n\",\"caption_yn\":\"Y\",\"quality_type\":\"n\",\"dubbing\":\"N\",\"summary_promotion\":\"\",\"sale_type\":\"X\",\"album_group_nm\":\"왕의 길\",\"super_yn\":\"Y\",\"promotion_copy\":\"\",\"audio_type\":\"Stereo\",\"poster_type\":\"P\",\"service_yn\":\"Y\",\"content_value\":\"M011516031PPV00HD110.png\",\"reserved_flag\":\"\",\"reserved_date\":\"\",\"asset_id\":\"M011516031PPV00HD100\"}\n");
        sql1.append(",{\"album_id\":\"M011516031PPV00\",\"album_name\":\"왕의 길\",\"series_desc\":\"2회\",\"onair_date\":\"\",\"release_date\":\"\",\"watch_2ndtv_yn\":\"N\",\"high_quality_type\":\"\",\"run_time\":\"00551500\",\"event_info\":\"\",\"service_icon\":\"\",\"terr_yn\":\"\",\"terr_ed_date\":\"\",\"smi_yn\":\"Y\",\"smi_language\":\"\",\"rating_cd\":\"05\",\"kids_grade\":\"\",\"country_of_origin_cd\":\"US\",\"director_display\":\"팀 반 패튼\",\"producer\":\"팀 반 패튼\",\"starring_actor\":\"숀 빈,마크 애디,미셸 페얼리\",\"actors_display\":\"주연: 숀 빈, 마크 애디\",\"voice_actor\":\"\",\"studio\":\"\",\"genre_large\":\"해외시리즈\",\"genre_mid\":\"미국\",\"genre_small\":\"판타지\",\"introduction\":\"\",\"sub_title\":\"\",\"summary_medium\":\"에다드는 왕의 핸드가 되는 것에 동의하고 딸 산사, 아리아와 함께 웨스테로스로 떠나게 된다.\",\"summary_long\":\"에다드는 왕의 핸드가 되는 것에 동의하고 딸 산사, 아리아와 함께 웨스테로스로 떠나게 된다.\",\"avg_rating\":\"\",\"tot_rating_count\":\"\",\"comment_cnt\":\"\",\"cine_id\":\"\",\"cine_avg_point\":\"\",\"cine_count\":\"\",\"series_no\":\"2\",\"viewing_flag\":\"V\",\"rank_no\":\"9.0\",\"dubbing_yn\":\"n\",\"caption_yn\":\"Y\",\"quality_type\":\"n\",\"dubbing\":\"N\",\"summary_promotion\":\"\",\"sale_type\":\"X\",\"album_group_nm\":\"왕의 길\",\"super_yn\":\"Y\",\"promotion_copy\":\"\",\"audio_type\":\"Stereo\",\"poster_type\":\"R\",\"service_yn\":\"Y\",\"content_value\":\"M011516031PPV00_R_000000.jpg\",\"reserved_flag\":\"\",\"reserved_date\":\"\",\"asset_id\":\"M011516031PPV00HD100\"}\n");
        sql1.append(",{\"album_id\":\"M011516031PPV00\",\"album_name\":\"왕의 길\",\"series_desc\":\"2회\",\"onair_date\":\"\",\"release_date\":\"\",\"watch_2ndtv_yn\":\"N\",\"high_quality_type\":\"\",\"run_time\":\"00551500\",\"event_info\":\"\",\"service_icon\":\"\",\"terr_yn\":\"\",\"terr_ed_date\":\"\",\"smi_yn\":\"Y\",\"smi_language\":\"\",\"rating_cd\":\"05\",\"kids_grade\":\"\",\"country_of_origin_cd\":\"US\",\"director_display\":\"팀 반 패튼\",\"producer\":\"팀 반 패튼\",\"starring_actor\":\"숀 빈,마크 애디,미셸 페얼리\",\"actors_display\":\"주연: 숀 빈, 마크 애디\",\"voice_actor\":\"\",\"studio\":\"\",\"genre_large\":\"해외시리즈\",\"genre_mid\":\"미국\",\"genre_small\":\"판타지\",\"introduction\":\"\",\"sub_title\":\"\",\"summary_medium\":\"에다드는 왕의 핸드가 되는 것에 동의하고 딸 산사, 아리아와 함께 웨스테로스로 떠나게 된다.\",\"summary_long\":\"에다드는 왕의 핸드가 되는 것에 동의하고 딸 산사, 아리아와 함께 웨스테로스로 떠나게 된다.\",\"avg_rating\":\"\",\"tot_rating_count\":\"\",\"comment_cnt\":\"\",\"cine_id\":\"\",\"cine_avg_point\":\"\",\"cine_count\":\"\",\"series_no\":\"2\",\"viewing_flag\":\"V\",\"rank_no\":\"9.0\",\"dubbing_yn\":\"n\",\"caption_yn\":\"Y\",\"quality_type\":\"n\",\"dubbing\":\"N\",\"summary_promotion\":\"\",\"sale_type\":\"X\",\"album_group_nm\":\"왕의 길\",\"super_yn\":\"Y\",\"promotion_copy\":\"\",\"audio_type\":\"Stereo\",\"poster_type\":\"V\",\"service_yn\":\"Y\",\"content_value\":\"M011516031PPV00HD170.jpg\",\"reserved_flag\":\"\",\"reserved_date\":\"\",\"asset_id\":\"M011516031PPV00HD100\"}\n");
        sql1.append(",{\"album_id\":\"M011516031PPV00\",\"album_name\":\"왕의 길\",\"series_desc\":\"2회\",\"onair_date\":\"\",\"release_date\":\"\",\"watch_2ndtv_yn\":\"N\",\"high_quality_type\":\"\",\"run_time\":\"00551500\",\"event_info\":\"\",\"service_icon\":\"\",\"terr_yn\":\"\",\"terr_ed_date\":\"\",\"smi_yn\":\"Y\",\"smi_language\":\"\",\"rating_cd\":\"05\",\"kids_grade\":\"\",\"country_of_origin_cd\":\"US\",\"director_display\":\"팀 반 패튼\",\"producer\":\"팀 반 패튼\",\"starring_actor\":\"숀 빈,마크 애디,미셸 페얼리\",\"actors_display\":\"주연: 숀 빈, 마크 애디\",\"voice_actor\":\"\",\"studio\":\"\",\"genre_large\":\"해외시리즈\",\"genre_mid\":\"미국\",\"genre_small\":\"판타지\",\"introduction\":\"\",\"sub_title\":\"\",\"summary_medium\":\"에다드는 왕의 핸드가 되는 것에 동의하고 딸 산사, 아리아와 함께 웨스테로스로 떠나게 된다.\",\"summary_long\":\"에다드는 왕의 핸드가 되는 것에 동의하고 딸 산사, 아리아와 함께 웨스테로스로 떠나게 된다.\",\"avg_rating\":\"\",\"tot_rating_count\":\"\",\"comment_cnt\":\"\",\"cine_id\":\"\",\"cine_avg_point\":\"\",\"cine_count\":\"\",\"series_no\":\"2\",\"viewing_flag\":\"V\",\"rank_no\":\"9.0\",\"dubbing_yn\":\"n\",\"caption_yn\":\"Y\",\"quality_type\":\"n\",\"dubbing\":\"N\",\"summary_promotion\":\"\",\"sale_type\":\"X\",\"album_group_nm\":\"왕의 길\",\"super_yn\":\"Y\",\"promotion_copy\":\"\",\"audio_type\":\"Stereo\",\"poster_type\":\"Y\",\"service_yn\":\"Y\",\"content_value\":\"M011516031PPV00HD160.jpg\",\"reserved_flag\":\"\",\"reserved_date\":\"\",\"asset_id\":\"M011516031PPV00HD100\"}\n");
        sql1.append(",{\"album_id\":\"M011516031PPV00\",\"album_name\":\"왕의 길\",\"series_desc\":\"2회\",\"onair_date\":\"\",\"release_date\":\"\",\"watch_2ndtv_yn\":\"N\",\"high_quality_type\":\"\",\"run_time\":\"00551500\",\"event_info\":\"\",\"service_icon\":\"\",\"terr_yn\":\"\",\"terr_ed_date\":\"\",\"smi_yn\":\"Y\",\"smi_language\":\"\",\"rating_cd\":\"05\",\"kids_grade\":\"\",\"country_of_origin_cd\":\"US\",\"director_display\":\"팀 반 패튼\",\"producer\":\"팀 반 패튼\",\"starring_actor\":\"숀 빈,마크 애디,미셸 페얼리\",\"actors_display\":\"주연: 숀 빈, 마크 애디\",\"voice_actor\":\"\",\"studio\":\"\",\"genre_large\":\"해외시리즈\",\"genre_mid\":\"미국\",\"genre_small\":\"판타지\",\"introduction\":\"\",\"sub_title\":\"\",\"summary_medium\":\"에다드는 왕의 핸드가 되는 것에 동의하고 딸 산사, 아리아와 함께 웨스테로스로 떠나게 된다.\",\"summary_long\":\"에다드는 왕의 핸드가 되는 것에 동의하고 딸 산사, 아리아와 함께 웨스테로스로 떠나게 된다.\",\"avg_rating\":\"\",\"tot_rating_count\":\"\",\"comment_cnt\":\"\",\"cine_id\":\"\",\"cine_avg_point\":\"\",\"cine_count\":\"\",\"series_no\":\"2\",\"viewing_flag\":\"V\",\"rank_no\":\"9.0\",\"dubbing_yn\":\"n\",\"caption_yn\":\"Y\",\"quality_type\":\"n\",\"dubbing\":\"N\",\"summary_promotion\":\"\",\"sale_type\":\"X\",\"album_group_nm\":\"왕의 길\",\"super_yn\":\"Y\",\"promotion_copy\":\"\",\"audio_type\":\"Stereo\",\"poster_type\":\"Z\",\"service_yn\":\"Y\",\"content_value\":\"M011516031PPV00HD180.zip\",\"reserved_flag\":\"\",\"reserved_date\":\"\",\"asset_id\":\"M011516031PPV00HD100\"}\n");
        sql1.append(",{\"album_id\":\"M011516032PPV00\",\"album_name\":\"스노우 경\",\"series_desc\":\"3회\",\"onair_date\":\"\",\"release_date\":\"\",\"watch_2ndtv_yn\":\"N\",\"high_quality_type\":\"\",\"run_time\":\"00571200\",\"event_info\":\"\",\"service_icon\":\"\",\"terr_yn\":\"0\",\"terr_ed_date\":\"\",\"smi_yn\":\"Y\",\"smi_language\":\"\",\"rating_cd\":\"05\",\"kids_grade\":\"\",\"country_of_origin_cd\":\"US\",\"director_display\":\"브라이언 커크\",\"producer\":\"브라이언 커크\",\"starring_actor\":\"숀 빈,마크 애디,미셸 페얼리\",\"actors_display\":\"주연: 숀 빈, 마크 애디\",\"voice_actor\":\"\",\"studio\":\"\",\"genre_large\":\"해외시리즈\",\"genre_mid\":\"미국\",\"genre_small\":\"판타지\",\"introduction\":\"\",\"sub_title\":\"\",\"summary_medium\":\"존은 블랙캐슬에서 티리온에게 깊은 인상을 받고, 에다드는 킹스랜딩에서 그의 과거와 미래에 대해 직면하게 된다.\",\"summary_long\":\"존은 블랙캐슬에서 티리온에게 깊은 인상을 받고, 에다드는 킹스랜딩에서 그의 과거와 미래에 대해 직면하게 된다.\",\"avg_rating\":\"\",\"tot_rating_count\":\"\",\"comment_cnt\":\"\",\"cine_id\":\"\",\"cine_avg_point\":\"\",\"cine_count\":\"\",\"series_no\":\"3\",\"viewing_flag\":\"V\",\"rank_no\":\"8.0\",\"dubbing_yn\":\"n\",\"caption_yn\":\"Y\",\"quality_type\":\"n\",\"dubbing\":\"N\",\"summary_promotion\":\"\",\"sale_type\":\"X\",\"album_group_nm\":\"스노우 경\",\"super_yn\":\"Y\",\"promotion_copy\":\"\",\"audio_type\":\"Stereo\",\"poster_type\":\"P\",\"service_yn\":\"Y\",\"content_value\":\"M011516032PPV00HD110.png\",\"reserved_flag\":\"\",\"reserved_date\":\"\",\"asset_id\":\"M011516032PPV00HD100\"}\n");
        sql1.append(",{\"album_id\":\"M011516032PPV00\",\"album_name\":\"스노우 경\",\"series_desc\":\"3회\",\"onair_date\":\"\",\"release_date\":\"\",\"watch_2ndtv_yn\":\"N\",\"high_quality_type\":\"\",\"run_time\":\"00571200\",\"event_info\":\"\",\"service_icon\":\"\",\"terr_yn\":\"0\",\"terr_ed_date\":\"\",\"smi_yn\":\"Y\",\"smi_language\":\"\",\"rating_cd\":\"05\",\"kids_grade\":\"\",\"country_of_origin_cd\":\"US\",\"director_display\":\"브라이언 커크\",\"producer\":\"브라이언 커크\",\"starring_actor\":\"숀 빈,마크 애디,미셸 페얼리\",\"actors_display\":\"주연: 숀 빈, 마크 애디\",\"voice_actor\":\"\",\"studio\":\"\",\"genre_large\":\"해외시리즈\",\"genre_mid\":\"미국\",\"genre_small\":\"판타지\",\"introduction\":\"\",\"sub_title\":\"\",\"summary_medium\":\"존은 블랙캐슬에서 티리온에게 깊은 인상을 받고, 에다드는 킹스랜딩에서 그의 과거와 미래에 대해 직면하게 된다.\",\"summary_long\":\"존은 블랙캐슬에서 티리온에게 깊은 인상을 받고, 에다드는 킹스랜딩에서 그의 과거와 미래에 대해 직면하게 된다.\",\"avg_rating\":\"\",\"tot_rating_count\":\"\",\"comment_cnt\":\"\",\"cine_id\":\"\",\"cine_avg_point\":\"\",\"cine_count\":\"\",\"series_no\":\"3\",\"viewing_flag\":\"V\",\"rank_no\":\"8.0\",\"dubbing_yn\":\"n\",\"caption_yn\":\"Y\",\"quality_type\":\"n\",\"dubbing\":\"N\",\"summary_promotion\":\"\",\"sale_type\":\"X\",\"album_group_nm\":\"스노우 경\",\"super_yn\":\"Y\",\"promotion_copy\":\"\",\"audio_type\":\"Stereo\",\"poster_type\":\"R\",\"service_yn\":\"Y\",\"content_value\":\"M011516032PPV00_R_000000.jpg\",\"reserved_flag\":\"\",\"reserved_date\":\"\",\"asset_id\":\"M011516032PPV00HD100\"}\n");
        sql1.append(",{\"album_id\":\"M011516032PPV00\",\"album_name\":\"스노우 경\",\"series_desc\":\"3회\",\"onair_date\":\"\",\"release_date\":\"\",\"watch_2ndtv_yn\":\"N\",\"high_quality_type\":\"\",\"run_time\":\"00571200\",\"event_info\":\"\",\"service_icon\":\"\",\"terr_yn\":\"0\",\"terr_ed_date\":\"\",\"smi_yn\":\"Y\",\"smi_language\":\"\",\"rating_cd\":\"05\",\"kids_grade\":\"\",\"country_of_origin_cd\":\"US\",\"director_display\":\"브라이언 커크\",\"producer\":\"브라이언 커크\",\"starring_actor\":\"숀 빈,마크 애디,미셸 페얼리\",\"actors_display\":\"주연: 숀 빈, 마크 애디\",\"voice_actor\":\"\",\"studio\":\"\",\"genre_large\":\"해외시리즈\",\"genre_mid\":\"미국\",\"genre_small\":\"판타지\",\"introduction\":\"\",\"sub_title\":\"\",\"summary_medium\":\"존은 블랙캐슬에서 티리온에게 깊은 인상을 받고, 에다드는 킹스랜딩에서 그의 과거와 미래에 대해 직면하게 된다.\",\"summary_long\":\"존은 블랙캐슬에서 티리온에게 깊은 인상을 받고, 에다드는 킹스랜딩에서 그의 과거와 미래에 대해 직면하게 된다.\",\"avg_rating\":\"\",\"tot_rating_count\":\"\",\"comment_cnt\":\"\",\"cine_id\":\"\",\"cine_avg_point\":\"\",\"cine_count\":\"\",\"series_no\":\"3\",\"viewing_flag\":\"V\",\"rank_no\":\"8.0\",\"dubbing_yn\":\"n\",\"caption_yn\":\"Y\",\"quality_type\":\"n\",\"dubbing\":\"N\",\"summary_promotion\":\"\",\"sale_type\":\"X\",\"album_group_nm\":\"스노우 경\",\"super_yn\":\"Y\",\"promotion_copy\":\"\",\"audio_type\":\"Stereo\",\"poster_type\":\"V\",\"service_yn\":\"Y\",\"content_value\":\"M011516032PPV00HD170.jpg\",\"reserved_flag\":\"\",\"reserved_date\":\"\",\"asset_id\":\"M011516032PPV00HD100\"}\n");
        sql1.append(",{\"album_id\":\"M011516032PPV00\",\"album_name\":\"스노우 경\",\"series_desc\":\"3회\",\"onair_date\":\"\",\"release_date\":\"\",\"watch_2ndtv_yn\":\"N\",\"high_quality_type\":\"\",\"run_time\":\"00571200\",\"event_info\":\"\",\"service_icon\":\"\",\"terr_yn\":\"0\",\"terr_ed_date\":\"\",\"smi_yn\":\"Y\",\"smi_language\":\"\",\"rating_cd\":\"05\",\"kids_grade\":\"\",\"country_of_origin_cd\":\"US\",\"director_display\":\"브라이언 커크\",\"producer\":\"브라이언 커크\",\"starring_actor\":\"숀 빈,마크 애디,미셸 페얼리\",\"actors_display\":\"주연: 숀 빈, 마크 애디\",\"voice_actor\":\"\",\"studio\":\"\",\"genre_large\":\"해외시리즈\",\"genre_mid\":\"미국\",\"genre_small\":\"판타지\",\"introduction\":\"\",\"sub_title\":\"\",\"summary_medium\":\"존은 블랙캐슬에서 티리온에게 깊은 인상을 받고, 에다드는 킹스랜딩에서 그의 과거와 미래에 대해 직면하게 된다.\",\"summary_long\":\"존은 블랙캐슬에서 티리온에게 깊은 인상을 받고, 에다드는 킹스랜딩에서 그의 과거와 미래에 대해 직면하게 된다.\",\"avg_rating\":\"\",\"tot_rating_count\":\"\",\"comment_cnt\":\"\",\"cine_id\":\"\",\"cine_avg_point\":\"\",\"cine_count\":\"\",\"series_no\":\"3\",\"viewing_flag\":\"V\",\"rank_no\":\"8.0\",\"dubbing_yn\":\"n\",\"caption_yn\":\"Y\",\"quality_type\":\"n\",\"dubbing\":\"N\",\"summary_promotion\":\"\",\"sale_type\":\"X\",\"album_group_nm\":\"스노우 경\",\"super_yn\":\"Y\",\"promotion_copy\":\"\",\"audio_type\":\"Stereo\",\"poster_type\":\"Y\",\"service_yn\":\"Y\",\"content_value\":\"M011516032PPV00HD160.jpg\",\"reserved_flag\":\"\",\"reserved_date\":\"\",\"asset_id\":\"M011516032PPV00HD100\"}\n");
        sql1.append(",{\"album_id\":\"M011516032PPV00\",\"album_name\":\"스노우 경\",\"series_desc\":\"3회\",\"onair_date\":\"\",\"release_date\":\"\",\"watch_2ndtv_yn\":\"N\",\"high_quality_type\":\"\",\"run_time\":\"00571200\",\"event_info\":\"\",\"service_icon\":\"\",\"terr_yn\":\"0\",\"terr_ed_date\":\"\",\"smi_yn\":\"Y\",\"smi_language\":\"\",\"rating_cd\":\"05\",\"kids_grade\":\"\",\"country_of_origin_cd\":\"US\",\"director_display\":\"브라이언 커크\",\"producer\":\"브라이언 커크\",\"starring_actor\":\"숀 빈,마크 애디,미셸 페얼리\",\"actors_display\":\"주연: 숀 빈, 마크 애디\",\"voice_actor\":\"\",\"studio\":\"\",\"genre_large\":\"해외시리즈\",\"genre_mid\":\"미국\",\"genre_small\":\"판타지\",\"introduction\":\"\",\"sub_title\":\"\",\"summary_medium\":\"존은 블랙캐슬에서 티리온에게 깊은 인상을 받고, 에다드는 킹스랜딩에서 그의 과거와 미래에 대해 직면하게 된다.\",\"summary_long\":\"존은 블랙캐슬에서 티리온에게 깊은 인상을 받고, 에다드는 킹스랜딩에서 그의 과거와 미래에 대해 직면하게 된다.\",\"avg_rating\":\"\",\"tot_rating_count\":\"\",\"comment_cnt\":\"\",\"cine_id\":\"\",\"cine_avg_point\":\"\",\"cine_count\":\"\",\"series_no\":\"3\",\"viewing_flag\":\"V\",\"rank_no\":\"8.0\",\"dubbing_yn\":\"n\",\"caption_yn\":\"Y\",\"quality_type\":\"n\",\"dubbing\":\"N\",\"summary_promotion\":\"\",\"sale_type\":\"X\",\"album_group_nm\":\"스노우 경\",\"super_yn\":\"Y\",\"promotion_copy\":\"\",\"audio_type\":\"Stereo\",\"poster_type\":\"Z\",\"service_yn\":\"Y\",\"content_value\":\"M011516032PPV00HD180.zip\",\"reserved_flag\":\"\",\"reserved_date\":\"\",\"asset_id\":\"M011516032PPV00HD100\"}\n");
        sql1.append("]\n");

        value = sql1.toString();

        List<ProductsDetailDto> productsDto = productsService.nxvod211TobeSql00602(value);
        return productsDto;
    }
}