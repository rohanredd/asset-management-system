package com.asset.management.service;
import java.util.List;

import com.fasterxml.jackson.annotation.JsonInclude;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.asset.management.dao.AssetsDao;
import com.asset.management.entity.Assets;
	
	@Service
	@JsonInclude(value= JsonInclude.Include.NON_NULL)
	public class AssetsServiceImpl implements AssetsService {
		  

		@Autowired
		private AssetsDao assetsDao;
		public AssetsServiceImpl() { 
			}
		
		@Override
		public List<Assets> getAsset() {
			return assetsDao.findAll();
		}

		@SuppressWarnings("deprecation")
		@Override
		public Assets getAssets(long assetsId) {
		 
			return assetsDao.getOne(assetsId);
		}

		@Override
		public Assets addAssets(Assets assets) {
			assetsDao.save(assets);
			return assets;
		}

		@Override
		public Assets updateAssets(Assets assets) {
			assetsDao.save(assets);
		
			return assets;
		}

		@Override
		public void deleteAssets(long parseLong) {
			@SuppressWarnings("deprecation")
			Assets entity=assetsDao.getOne(parseLong);
			assetsDao.delete(entity);
			
		
		}

		
		

		
	}


