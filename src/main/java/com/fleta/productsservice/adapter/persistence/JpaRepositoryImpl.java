package com.fleta.productsservice.adapter.persistence;

import com.fleta.productsservice.domain.dto.ContentsDto;
import com.fleta.productsservice.domain.dto.ProductsDetailDto;
import com.fleta.productsservice.domain.dto.ProductsDto;
import com.fleta.productsservice.port.outbound.ProductsRepository;
import lombok.extern.slf4j.Slf4j;
import org.qlrm.mapper.JpaResultMapper;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import java.util.ArrayList;
import java.util.List;

@Repository
@Slf4j
public class JpaRepositoryImpl implements ProductsRepository {

    @PersistenceContext
    private EntityManager em;

    @Override
    public List<ProductsDto> nxvod211TobeSql00502(String jsonData) {
        List<ProductsDto> searchResult = new ArrayList<>();
        try {
            long start = System.currentTimeMillis();
            log.info("----------start: " + start);
            String queryString = queryNxvod211TobeSql00502(jsonData);
            Query query = em.createNativeQuery(queryString);
            log.info("----------createquery: " + System.currentTimeMillis());
            JpaResultMapper resultMapper = new JpaResultMapper();
            searchResult = resultMapper.list(query, ProductsDto.class);
            long end = System.currentTimeMillis();
            log.info("----------duration: " + (end - start));
        } catch (Exception ex) {

        }
        return searchResult;
    }

    @Override
    public List<ProductsDetailDto> nxvod211TobeSql00602(String jsonData) {
        List<ProductsDetailDto> searchResult = new ArrayList<>();
        try {
            String queryString = queryNxvod211TobeSql00602(jsonData);
            Query query = em.createNativeQuery(queryString);
            JpaResultMapper resultMapper = new JpaResultMapper();
            searchResult = resultMapper.list(query, ProductsDetailDto.class);
        } catch (Exception ex) {

        }
        return searchResult;
    }

    @Override
    public List<ContentsDto> nxvod211TobeSql01903(String jsonData) {
        try {
            String queryString = queryNxvod211TobeSql01903(jsonData);
            Query query = em.createNativeQuery(queryString);
            JpaResultMapper resultMapper = new JpaResultMapper();
            List<ContentsDto> productsDetails = resultMapper.list(query, ContentsDto.class);
            return productsDetails;
        } catch (Exception ex) {
            return null;
        }
    }

    private String queryNxvod211TobeSql00502(String jsonData) {
        StringBuffer sql = new StringBuffer();
        sql.append("select /* nxvod211_TOBE_SQL005_02 */\n" );
        sql.append("       'Y' super_yn, \n" );
        sql.append("       r.album_group_nm, \n" );
        sql.append("       r.quality_type, \n" );
        sql.append("       r.series_no, \n" );
        sql.append("       r.rank_no,\n" );
        sql.append("       r.contents_id, \n" );
        sql.append("       'X' sale_type, \n" );
        sql.append("       'V' viewing_flag,\n" );
        sql.append("       case when s.promotion_start_date <= to_char(now(),'YYYY-MM-DD') and s.promotion_end_date >= to_char(now(),'YYYY-MM-DD') \n" );
        sql.append("            then s.summary_promotion \n" );
        sql.append("            else '' \n" );
        sql.append("            end summary_promotion,\n" );
        sql.append("       r.dubbing_yn,\n" );
        sql.append("       r.caption_yn\n" );
        sql.append("  from (\n" );
        sql.append("           select album_group_id,\n" );
        sql.append("                  album_group_nm, \n" );
        sql.append("                  quality_type,\n" );
        sql.append("                  series_no,\n" );
        sql.append("                  rank_no,\n" );
        sql.append("                  contents_id, \n" );
        sql.append("                  dubbing_yn,\n" );
        sql.append("                  caption_yn,\n" );
        sql.append("                  order_no\n" );
        sql.append("             from json_to_recordset('\n" );
        sql.append(jsonData);
        sql.append("') as x(\n" );
        sql.append("                      album_group_id text , \n" );
        sql.append("                      album_group_nm text,\n" );
        sql.append("                      quality_type text,\n" );
        sql.append("                      series_no text,\n" );
        sql.append("                      rank_no text,\n" );
        sql.append("                      contents_id text, \n" );
        sql.append("                      dubbing_yn text,\n" );
        sql.append("                      caption_yn text,\n" );
        sql.append("                      order_no text\n" );
        sql.append("             )\n" );
        sql.append("       ) r,\n" );
        sql.append("       imcsuser.pt_pd_package_sub s\n" );
        sql.append(" where r.album_group_id = s.product_id" );
        sql.append(" order by r.order_no" );
//        sql.append(" order by r.order_no::DECIMAL" );

        return sql.toString();
    }

    private String queryNxvod211TobeSql00602(String jsonData) {
        StringBuffer sql = new StringBuffer();

        sql.append("SELECT /* nxvod211_TOBE_SQL006_02 */																																						\n" );
        sql.append("       gijun.album_id,                                                                                                                                                                      \n" );
        sql.append("       gijun.album_name,                                                                                                                                                                    \n" );
        sql.append("       gijun.series_desc,                                                                                                                                                                   \n" );
        sql.append("       gijun.onair_date,                                                                                                                                                                    \n" );
        sql.append("       gijun.release_date,                                                                                                                                                                  \n" );
        sql.append("       gijun.watch_2ndtv_yn,                                                                                                                                                                \n" );
        sql.append("       gijun.high_quality_type,                                                                                                                                                             \n" );
        sql.append("       gijun.run_time,                                                                                                                                                                      \n" );
        sql.append("       gijun.event_info,                                                                                                                                                                    \n" );
        sql.append("       gijun.service_icon,                                                                                                                                                                  \n" );
        sql.append("       gijun.terr_yn,                                                                                                                                                                       \n" );
        sql.append("       gijun.terr_ed_date,                                                                                                                                                                  \n" );
        sql.append("       gijun.smi_yn,                                                                                                                                                                        \n" );
        sql.append("       gijun.smi_language,                                                                                                                                                                  \n" );
        sql.append("       gijun.rating_cd,                                                                                                                                                                     \n" );
        sql.append("       gijun.kids_grade,                                                                                                                                                                    \n" );
        sql.append("       gijun.country_of_origin_cd,                                                                                                                                                          \n" );
        sql.append("       gijun.director_display,                                                                                                                                                              \n" );
        sql.append("       gijun.producer,                                                                                                                                                                      \n" );
        sql.append("       gijun.starring_actor,                                                                                                                                                                \n" );
        sql.append("       gijun.actors_display,                                                                                                                                                                \n" );
        sql.append("       gijun.voice_actor,                                                                                                                                                                   \n" );
        sql.append("       gijun.studio,                                                                                                                                                                        \n" );
        sql.append("       gijun.genre_large,                                                                                                                                                                   \n" );
        sql.append("       gijun.genre_mid,                                                                                                                                                                     \n" );
        sql.append("       gijun.genre_small,                                                                                                                                                                   \n" );
        sql.append("       gijun.introduction,                                                                                                                                                                  \n" );
        sql.append("       gijun.sub_title,                                                                                                                                                                     \n" );
        sql.append("       gijun.summary_medium,                                                                                                                                                                \n" );
        sql.append("       gijun.summary_long,                                                                                                                                                                  \n" );
        sql.append("       gijun.avg_rating,                                                                                                                                                                    \n" );
        sql.append("       gijun.tot_rating_count,                                                                                                                                                              \n" );
        sql.append("       gijun.comment_cnt,                                                                                                                                                                   \n" );
        sql.append("       gijun.cine_id,                                                                                                                                                                       \n" );
        sql.append("       gijun.cine_avg_point,                                                                                                                                                                \n" );
        sql.append("       gijun.cine_count,                                                                                                                                                                    \n" );
        sql.append("       gijun.series_no,                                                                                                                                                                     \n" );
        sql.append("       gijun.viewing_flag,                                                                                                                                                                  \n" );
        sql.append("       gijun.rank_no,                                                                                                                                                                       \n" );
        sql.append("       gijun.dubbing_yn,                                                                                                                                                                    \n" );
        sql.append("       gijun.caption_yn,                                                                                                                                                                    \n" );
        sql.append("       gijun.quality_type,                                                                                                                                                                  \n" );
        sql.append("       gijun.dubbing,                                                                                                                                                                       \n" );
        sql.append("       gijun.summary_promotion,                                                                                                                                                             \n" );
        sql.append("       gijun.sale_type,                                                                                                                                                                     \n" );
        sql.append("       gijun.album_group_nm,                                                                                                                                                                \n" );
        sql.append("       gijun.super_yn,                                                                                                                                                                      \n" );
        sql.append("       gijun.promotion_copy,                                                                                                                                                                \n" );
        sql.append("       gijun.audio_type,    --is_51ch                                                                                                                                                       \n" );
        sql.append("       gijun.poster_type,   --poster_r, poster_h, poster_v                                                                                                                                  \n" );
        sql.append("       gijun.service_yn,    --poster_r, poster_h, poster_v                                                                                                                                  \n" );
        sql.append("       gijun.content_value, --poster_r, poster_h, poster_v                                                                                                                                  \n" );
        sql.append("       gijun.reserved_flag, --service_flag                                                                                                                                                  \n" );
        sql.append("       gijun.reserved_date                                                                                                                                                                  \n" );
        sql.append("  FROM (                                                                                                                                                                                    \n" );
        sql.append("           select                                                                                                                                                                           \n" );
        sql.append("                  album_id                   ,                                                                                                                                              \n" );
        sql.append("                  album_name              ,                                                                                                                                                 \n" );
        sql.append("                  series_desc             ,                                                                                                                                                 \n" );
        sql.append("                  onair_date              ,                                                                                                                                                 \n" );
        sql.append("                  release_date            ,                                                                                                                                                 \n" );
        sql.append("                  watch_2ndtv_yn          ,                                                                                                                                                 \n" );
        sql.append("                  high_quality_type       ,                                                                                                                                                 \n" );
        sql.append("                  run_time                ,                                                                                                                                                 \n" );
        sql.append("                  event_info              ,                                                                                                                                                 \n" );
        sql.append("                  service_icon            ,                                                                                                                                                 \n" );
        sql.append("                  terr_yn                 ,                                                                                                                                                 \n" );
        sql.append("                  terr_ed_date            ,                                                                                                                                                 \n" );
        sql.append("                  smi_yn                  ,                                                                                                                                                 \n" );
        sql.append("                  smi_language            ,                                                                                                                                                 \n" );
        sql.append("                  rating_cd               ,                                                                                                                                                 \n" );
        sql.append("                  kids_grade              ,                                                                                                                                                 \n" );
        sql.append("                  country_of_origin_cd    ,                                                                                                                                                 \n" );
        sql.append("                  director_display        ,                                                                                                                                                 \n" );
        sql.append("                  producer                ,                                                                                                                                                 \n" );
        sql.append("                  starring_actor          ,                                                                                                                                                 \n" );
        sql.append("                  actors_display          ,                                                                                                                                                 \n" );
        sql.append("                  voice_actor             ,                                                                                                                                                 \n" );
        sql.append("                  studio                  ,                                                                                                                                                 \n" );
        sql.append("                  genre_large             ,                                                                                                                                                 \n" );
        sql.append("                  genre_mid               ,                                                                                                                                                 \n" );
        sql.append("                  genre_small             ,                                                                                                                                                 \n" );
        sql.append("                  introduction            ,                                                                                                                                                 \n" );
        sql.append("                  sub_title               ,                                                                                                                                                 \n" );
        sql.append("                  summary_medium          ,                                                                                                                                                 \n" );
        sql.append("                  summary_long            ,                                                                                                                                                 \n" );
        sql.append("                  avg_rating              ,                                                                                                                                                 \n" );
        sql.append("                  tot_rating_count        ,                                                                                                                                                 \n" );
        sql.append("                  comment_cnt             ,                                                                                                                                                 \n" );
        sql.append("                  cine_id                 ,                                                                                                                                                 \n" );
        sql.append("                  cine_avg_point          ,                                                                                                                                                 \n" );
        sql.append("                  cine_count              ,                                                                                                                                                 \n" );
        sql.append("                  series_no               ,                                                                                                                                                 \n" );
        sql.append("                  viewing_flag            ,                                                                                                                                                 \n" );
        sql.append("                  rank_no                 ,                                                                                                                                                 \n" );
        sql.append("                  dubbing_yn              ,                                                                                                                                                 \n" );
        sql.append("                  caption_yn              ,                                                                                                                                                 \n" );
        sql.append("                  quality_type            ,                                                                                                                                                 \n" );
        sql.append("                  dubbing                 ,                                                                                                                                                 \n" );
        sql.append("                  summary_promotion       ,                                                                                                                                                 \n" );
        sql.append("                  sale_type               ,                                                                                                                                                 \n" );
        sql.append("                  album_group_nm          ,                                                                                                                                                 \n" );
        sql.append("                  super_yn                ,                                                                                                                                                 \n" );
        sql.append("                  promotion_copy          ,                                                                                                                                                 \n" );
        sql.append("                  audio_type              ,                                                                                                                                                 \n" );
        sql.append("                  poster_type             ,                                                                                                                                                 \n" );
        sql.append("                  service_yn              ,                                                                                                                                                 \n" );
        sql.append("                  content_value           ,                                                                                                                                                 \n" );
        sql.append("                  reserved_flag           ,                                                                                                                                                 \n" );
        sql.append("                  reserved_date           ,                                                                                                                                                 \n" );
        sql.append("                  asset_id                                                                                                                                                                  \n" );
        sql.append("             from json_to_recordset('                                                                                                                                                        \n" );
        sql.append(jsonData.replaceAll("'", "''"));
        sql.append("                  ') as x(                                                                                                                                                                   \n" );
        sql.append("                         album_id                text, album_name              text, series_desc             text, onair_date              text,                                         \n" );
        sql.append("                         release_date            text, watch_2ndtv_yn          text, high_quality_type       text, run_time                text,                                            \n" );
        sql.append("                         event_info              text, service_icon            text, terr_yn                 text, terr_ed_date            text,                                            \n" );
        sql.append("                         smi_yn                  text, smi_language            text, rating_cd               text, kids_grade              text,                                            \n" );
        sql.append("                         country_of_origin_cd    text, director_display        text, producer                text, starring_actor          text,                                            \n" );
        sql.append("                         actors_display          text, voice_actor             text, studio                  text, genre_large             text,                                            \n" );
        sql.append("                         genre_mid               text, genre_small             text, introduction            text, sub_title               text,                                            \n" );
        sql.append("                         summary_medium          text, summary_long            text, avg_rating              text, tot_rating_count        text,                                            \n" );
        sql.append("                         comment_cnt             text, cine_id                 text, cine_avg_point          text, cine_count              text,                                            \n" );
        sql.append("                         series_no               text, viewing_flag            text, rank_no                 text, dubbing_yn              text,                                            \n" );
        sql.append("                         caption_yn              text, quality_type            text, dubbing                 text, summary_promotion       text,                                            \n" );
        sql.append("                         sale_type               text, album_group_nm          text, super_yn                text, promotion_copy          text,                                            \n" );
        sql.append("                         audio_type              text, poster_type             text, service_yn              text, content_value           text,                                            \n" );
        sql.append("                         reserved_flag           text, reserved_date           text, asset_id                text                                                                           \n" );
        sql.append("                  )                                                                                                                                                                         \n" );
        sql.append("       ) gijun                                                                                                                                                                              \n" );
        sql.append(" inner join IMCSUSER.PT_PD_PACKAGE_DETAIL D                                                                                                                                                 \n" );
        sql.append("    on D.contents_id = gijun.asset_id                                                                                                                                                       \n" );
        sql.append(" inner join IMCSUSER.PT_PD_PACKAGE G                                                                                                                                                        \n" );
        sql.append("    on D.product_id = G.product_id																																							\n" );
//        sql.append(" order by rank_no::DECIMAL desc			                                                                                                                                                    \n" );
        return sql.toString();
    }

    private String queryNxvod211TobeSql01903(String jsonData) {
        StringBuffer sql = new StringBuffer();
        sql.append("SELECT /* nxvod211_TOBE_SQL019_03 */                                                                                                                                           \n");
        sql.append("       P.contents_id,                                                                                                                                                          \n");
        sql.append("       case when P.pre_sale_yn = 'Y' and A.expired_date = '0' then P.expired_date                                                                                              \n");
        sql.append("            else A.expired_date                                                                                                                                                \n");
        sql.append("       end expired_date                                                                                                                                                        \n");
        sql.append("FROM   json_to_recordset('").append(jsonData).append("') as A(product_id text, expired_date text)                                                                              \n");
        sql.append("INNER JOIN                                                                                                                                                                     \n");
        sql.append("       (SELECT G.product_id,                                                                                                                                                   \n");
        sql.append("               D.contents_id,                                                                                                                                                  \n");
        sql.append("               COALESCE(G.pre_sale_yn, 'N') pre_sale_yn,                                                                                                                       \n");
        sql.append("               case when Trim(G.close_date) is null then TO_CHAR(now() + interval '1 day', 'YYYYMMDDHH24MISS')                                                                 \n");
        sql.append("                    else TO_CHAR(TO_DATE(SUBSTR(G.close_date, 1, 12), 'yyyymmddhh24mi') + CAST(G.expired_date AS INTEGER), 'yyyymmddhh24mi') || substr(G.close_date, 13, 2)    \n");
        sql.append("               end expired_date                                                                                                                                                \n");
        sql.append("        FROM       IMCSUSER.PT_PD_PACKAGE_DETAIL D                                                                                                                             \n");
        sql.append("        inner join IMCSUSER.PT_PD_PACKAGE G                                                                                                                                    \n");
        sql.append("        on    D.product_id = G.product_id                                                                                                                                      \n");
        sql.append("        WHERE 1=1                                                                                                                                                              \n");
        sql.append("        AND   G.product_type = '2') P                                                                                                                                          \n");
        sql.append("ON      A.product_id = P.product_id                                                                                                                                            \n");
        return sql.toString();
    }
}
