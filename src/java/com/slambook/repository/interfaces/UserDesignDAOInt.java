
package com.slambook.repository.interfaces;
import com.slambook.entity.UserDesign;
public interface UserDesignDAOInt{


	public UserDesign getUserDesign(int userId);
	public void updateUserDesign(UserDesign userDesign);
	public void updateSlambookPagesBackgroundTexture(int userId,int textureId);
	public void updateSlambookBackgroundTexture(int userId,int textureId);
	public void updateSlambookPagesFontColor(int userId,String colorId);
	public void updateSlambookHeaderFooterTexture(int userId,int textureId);


}