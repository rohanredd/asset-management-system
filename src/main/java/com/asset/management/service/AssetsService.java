package com.asset.management.service;

   import java.util.List;
    import com.asset.management.entity.Assets;

	public interface AssetsService {
		public List<Assets>getAsset();
		public Assets getAssets(long assetsId);
		public Assets addAssets(Assets assets);
		public Assets updateAssets(Assets assets);
		public void deleteAssets(long parseLong);
		
		
		
			
		}

	

