import { TestBed } from '@angular/core/testing';

import { FirebseService } from './firebse.service';

describe('FirebseService', () => {
  beforeEach(() => TestBed.configureTestingModule({}));

  it('should be created', () => {
    const service: FirebseService = TestBed.get(FirebseService);
    expect(service).toBeTruthy();
  });
});
