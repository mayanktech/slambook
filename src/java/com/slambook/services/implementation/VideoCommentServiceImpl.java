/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.slambook.services.implementation;

import com.slambook.entity.VideoComments;
import com.slambook.services.interfaces.VideoCommentServiceInt;
import java.util.ArrayList;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 *
 * @author mayank
 */
@Service
@Transactional
public class VideoCommentServiceImpl implements VideoCommentServiceInt  {

    @Override
    public void addVideoComments(VideoComments videoComments) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public ArrayList getVideoComments(long videoId) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public long getVideoCommentsCount(long videoId) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
