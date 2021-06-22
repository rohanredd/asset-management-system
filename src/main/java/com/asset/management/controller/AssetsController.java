package com.asset.management.controller;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.asset.management.entity.Assets;
import com.asset.management.service.AssetsService;


@RestController
public class AssetsController {
	
	@Autowired
	private AssetsService assetsService;
	
	@GetMapping("/asset")
    public List<Assets> getAsset()
    {
		return this.assetsService.getAsset();
    	
    }
	
	@GetMapping("/asset/{assetsId}")
	public Assets getAssets(@PathVariable String assetsId)
	{
		return this.assetsService.getAssets(Long.parseLong(assetsId));
	}
	@PostMapping("/asset")
	public Assets addAssets(@RequestBody Assets assets)
	{
		return this.assetsService.addAssets(assets);
	}
	
	@PutMapping("/asset")
	public Assets updateAssets(@RequestBody Assets assets)
	{
		return this.assetsService.updateAssets(assets);
	}
	@DeleteMapping("/asset/{assetsId}")
	public ResponseEntity<HttpStatus> deleteAssets(@PathVariable String assetsId){
		try {
			this.assetsService.deleteAssets(Long.parseLong(assetsId));
			return new ResponseEntity<>(HttpStatus.OK);
		}
		catch(Exception e) {
			return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
			
		}
	}
	

	
}
